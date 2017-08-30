package me.shoma.ayumi.model

import java.time.ZonedDateTime
import java.util.UUID

import com.mohiva.play.silhouette.api.util.PasswordInfo
import com.mohiva.play.silhouette.api.{Identity, LoginInfo}

case class User(
                 id: UUID,
                 loginInfo: LoginInfo,
                 firstName: Option[String],
                 lastName: Option[String],
                 email: Option[String],
                 passwordInfo: Option[PasswordInfo],
                 createdAt: ZonedDateTime = ZonedDateTime.now(),
                 updatedAt: ZonedDateTime
               ) extends Identity


