import { addDecorator } from '@storybook/react';
import { ThemeProvider } from '@mui/material';

import { theme } from '/home/suhasj/LDP/React/reacr-jsript/src/theme.js';

addDecorator((story) => (
  
    <ThemeProvider theme={theme}>
    {story()}
    </ThemeProvider>
  
));

export const parameters = {
  actions: { argTypesRegex: "^on[A-Z].*" },
  controls: {
    matchers: {
      color: /(background|color)$/i,
      date: /Date$/,
    },
  },
}