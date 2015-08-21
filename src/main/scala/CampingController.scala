package io.buildo.baseexample

import models._

import scalaz._
import Scalaz._
import scalaz.EitherT._

import scala.concurrent.ExecutionContext.Implicits.global

trait CampingControllerModule extends io.buildo.base.MonadicCtrlModule {
  object campingController {
    def getAll: FutureCtrlFlow[List[Camping]] = List(
      Camping("Le Marze", 15),
      Camping("Sunset Camping", 22)).point[FutureCtrlFlow]

    def getByCoolnessAndSize(coolness: String, size: Option[Int]): FutureCtrlFlow[List[Camping]] = List(
      Camping("Le Marze", 15),
      Camping("Sunset Camping", 22)).point[FutureCtrlFlow]

    def getById(id: Int): FutureCtrlFlow[Camping] = 
      Camping("Le Marze", 15).point[FutureCtrlFlow]

    def create(camping: Camping): FutureCtrlFlow[Camping] =
      camping.point[FutureCtrlFlow]

  }
}
