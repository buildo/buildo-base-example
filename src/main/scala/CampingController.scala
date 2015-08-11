package io.buildo.baseexample

import models._

import scalaz._
import Scalaz._
import scalaz.EitherT._

import scala.concurrent.ExecutionContext.Implicits.global

trait CampingControllerModule extends io.buildo.base.MonadicCtrlModule {
  object campingController {
    def getAll: FutureCtrlFlow[List[Camping]] = List(
      Camping("Le Marze"),
      Camping("Sunset Camping")).point[FutureCtrlFlow]

  }
}
