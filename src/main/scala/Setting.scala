package me.shoma.ayumi.model

case class Setting(key: String, value: Any)

object Setting {
  val title = "title"
  val url = "url"
  val description = "description"
  val permalink = "permalink"
  val feedCount = "feed-count"
}