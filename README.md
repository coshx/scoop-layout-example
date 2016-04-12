# Scoop Layout Example

<img src="https://raw.githubusercontent.com/coshx/scoop-layout-example/master/readme.gif" alt="readme.gif" width="350px">

[Related to this blog post](http://www.coshx.com/blog/2016/04/12/introduction-to-scoop/).

This application shows how to build a body/footer layout with [Scoop](https://github.com/lyft/scoop) and support a fullscreen mode as well.

To make it short, we use waterfall routers to forward screens among the different subcomponents of our UI. 

This example only overwrites the `goTo` and `goBack` methods. If needed, you can implement the same behavior for the other Router's methods.
