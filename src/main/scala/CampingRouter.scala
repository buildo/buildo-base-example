package io.buildo.baseexample

import models._

import spray.routing._
import spray.routing.Directives._
import spray.httpx.SprayJsonSupport._

import scala.concurrent.ExecutionContext.Implicits.global

trait CampingRouterModule extends io.buildo.base.MonadicCtrlRouterModule
  with io.buildo.base.MonadicRouterHelperModule
  with io.buildo.base.ConfigModule
  with JsonSerializerModule
  
  with CampingControllerModule {

  import ExampleJsonProtocol._
  import RouterHelpers._

  @annotations.publish
  val campingRoute = {
    pathPrefix("campings") {
      (get & pathEnd) (returns[List[Camping]].ctrl(campingController.getAll _))
    }
  }
}
