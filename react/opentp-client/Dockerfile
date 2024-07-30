FROM node:10.21.0-alpine3.11 AS react-build
#RUN npm_config_target_arch=x64 npm i grpc-tools
ARG CI=true
WORKDIR /app
COPY . ./
RUN npx browserslist@latest --update-db
RUN yarn
RUN yarn test
RUN yarn build

FROM nginx:1.17
COPY --from=react-build /app/build /usr/share/nginx/html

