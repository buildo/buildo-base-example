package io.buildo.baseexample

import models._

import spray.json._

trait JsonSerializerModule extends io.buildo.base.MonadicCtrlJsonModule
  with io.buildo.base.JsonModule {

  object ExampleJsonProtocol extends AutoProductFormat
    with DefaultJsonProtocol {

    import io.buildo.ingredients.jsend.JSendJsonProtocol._

    import io.buildo.ingredients.jsend.dsl._

    implicit val CampingSerializationInfo = `for`[Camping] serializeOneAs("camping") andMultipleAs("campings")
  }
}
