package flight.converter.crane.pojo

case class CraneIssueTicket(craneHeader: CraneHeader,
                            pnrRef: String,
                            currency: String = "NGN",
                            amount: BigDecimal
                           );