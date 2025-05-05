const { defineConfig } = require('@vue/cli-service')
// vue.config.js
module.exports = {
  devServer: {
    proxy: {
      '/api': {
        target: 'http://124.221.15.13:8080', // 后端服务器地址
        changeOrigin: true, // 是否更改请求头中的 origin
        pathRewrite: {
          '^/api': '' // 重写路径，去掉 /api 前缀
        }
      }
    }
  }
}