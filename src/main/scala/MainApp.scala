import com.app.protobuf.change.ChangeMessage

object MainApp extends App {
  val changeMessage = ChangeMessage(
    id = 1,
    changeFrom = "2020-01-01",
    changeTo = "2020-02-01",
  )
}
