FROM node:lts-alpine AS dependencies
WORKDIR /app
COPY ./front/package.json ./front/yarn.lock ./
RUN yarn install --frozen-lockfile

FROM node:lts-alpine AS builder
WORKDIR /app
COPY ./front/ .
COPY --from=dependencies /app/node_modules ./node_modules
RUN yarn build && yarn install --production --ignore-scripts --prefer-offline

# Production image, copy all the files and run next
FROM node:lts-alpine AS runner
WORKDIR /app

ENV NODE_ENV production
ENV NEXT_PUBLIC_GOOGLE_MAP_URL ${NEXT_PUBLIC_GOOGLE_MAP_URL}
ENV NEXT_PUBLIC_GOOGLE_MAP_KEY ${NEXT_PUBLIC_GOOGLE_MAP_KEY}

RUN addgroup -g 1001 -S nodejs
RUN adduser -S nextjs -u 1001

# You only need to copy next.config.js if you are NOT using the default configuration
# COPY --from=builder /app/next.config.js ./
COPY --from=builder /app/public ./public
COPY --from=builder --chown=nextjs:nodejs /app/.next ./.next
COPY --from=builder /app/node_modules ./node_modules
COPY --from=builder /app/package.json ./package.json
USER nextjs

EXPOSE 3000

# Next.js collects completely anonymous telemetry data about general usage.
# Learn more here: https://nextjs.org/telemetry
# Uncomment the following line in case you want to disable telemetry.
# ENV NEXT_TELEMETRY_DISABLED 1

CMD ["yarn", "start"]

