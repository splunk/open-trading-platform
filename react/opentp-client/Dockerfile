FROM node:14.8.0-slim AS react-build
#RUN npm_config_target_arch=x64 npm i grpc-tools
ARG CI=true
WORKDIR /app
COPY . ./
#RUN npx browserslist@latest --update-db
#RUN  npx update-browserslist-db@latest
RUN yarn install

#RUN yarn test
RUN yarn build


EXPOSE 3000

#CMD [ "yarn", "start" ]
FROM nginx:1.17
#FROM nginx:1.27.0-alpine-otel
COPY --from=react-build /app/build /usr/share/nginx/html

