import { combineReducers } from 'redux';
import loginReducer from './loginReducer';
import signupReduer from './signupReducer';
import locationReducer from './locationReducer';
import postReducer from './postReducer';
import imageReducer from './imageReducer';

const reducers = combineReducers({
  signup: signupReduer,
  login: loginReducer,
  location: locationReducer,
  post: postReducer,
  image: imageReducer,
});

export default reducers;

export type RootState = ReturnType<typeof reducers>;
