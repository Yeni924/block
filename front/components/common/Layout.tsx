import Head from 'next/head';
import styled from 'styled-components';
import KakaoScript from './KakaoMapScript';

interface LayoutProps {
  children: any;
}

const Layout = ({ children }: LayoutProps) => {
  return (
    <>
      <Head>
        <KakaoScript />
      </Head>
      <Wrapper>{children}</Wrapper>
    </>
  );
};

export default Layout;

const Wrapper = styled.div`
  max-width: 2280px;
  width: 100%;
  margin-left: auto;
  margin-right: auto;
`;
