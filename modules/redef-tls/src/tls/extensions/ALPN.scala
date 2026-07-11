package redef.tls.extensions

trait AlpnByteCodes(val bytes: IArray[Byte])

/**
 * TLS Application-Layer Protocol Negotiation (ALPN) Protocol IDs
 */
enum AlpnProtocol(val name: String):
  // scalafmt: { maxColumn = 150, align.preset = most, align.tokens."+" =  [{ code = "with" }] }
  case HTTP_1_1 extends AlpnProtocol("http/1.1") with AlpnByteCodes(IArray(0x68, 0x74, 0x74, 0x70, 0x2f, 0x31, 0x2e, 0x31))
  case HTTP_2   extends AlpnProtocol("h2")       with AlpnByteCodes(IArray(0x68, 0x32))
  case HTTP_2_C extends AlpnProtocol("h2c")      with AlpnByteCodes(IArray(0x68, 0x32, 0x63))
  case HTTP_3   extends AlpnProtocol("h3")       with AlpnByteCodes(IArray(0x68, 0x33))

object AlpnProtocol:

  val DefaultProtocols: List[AlpnProtocol] =
    List(HTTP_2, HTTP_1_1)

  val SupportedProtocols: Set[AlpnProtocol] =
    Set(HTTP_1_1, HTTP_2, HTTP_3)

end AlpnProtocol
