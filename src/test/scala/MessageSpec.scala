import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import com.app.protobuf.change._
import scalapb.json4s.JsonFormat

class MessageSpec extends AnyWordSpec with Matchers {
  "ChangeMessage" should {
    "decode correctly" in {
      val changeMessageJSON =
        """{
            "id": 1,
            "changeFrom": "2020-01-01",
            "changeTo": "2020-02-01",
            "mType": {
              "id": 1,
              "value": "codex"
            },
            "mode": "Normal"
        }"""

      JsonFormat.fromJsonString[ChangeMessage](changeMessageJSON) shouldBe
        ChangeMessage(
          id = 1,
          changeFrom = "2020-01-01",
          changeTo = "2020-02-01",
          mType = MessageType(
            id = 1,
            value = "codex",
          ),
          Some(ChangeMessageMode.Normal)
        )
    }
  }
}
