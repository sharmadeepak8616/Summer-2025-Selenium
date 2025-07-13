package Class4;

public class XPath_Discussion_2 {
    /**
     * <tag1 attr11="val1" attr12="val2" attr13>
     *     <tag2 attr21="val21" attr22="val22">
     *         <tag21 attr21="val21" attr22 attr23="val23">
     *              <tag24 attr21="val21" attr22 attr23="val23">
     *                      "Text"
     *              </tag24>
     *         </tag21>
     *         <tag22 attr22="val22" attr12 attr23="val23">
     *             "Text Value"
     *         </tag22>
     *         <tag4 attr="val">
     *              Text
     *         </tag4>
     *         text value
     *     </tag2>
     *     <tag31 attr22="val22" attr22 attr23="val23"> Preceding-siblings -> tag2 ; following-sibling -> tag3, tag4, tag5
     *          "Text Value"
     *          <tag22 attr22="val22" attr12 attr23="val23">
     *              <tag4 attr="val">
     *                  Text
     *              </tag4>
     *              "Text Value"
     *          </tag22>
     *     </tag31>
     *     <tag3>
     *         <tag31 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *              <tag22 attr22="val22" attr12 attr23="val23">
     *                  <tag4 attr="val">   ---> Write locator for tag4
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag22>
     *              <tag22 attr12="val22" attr22 attr23="val23">    --> Preceding-siblings -> tag22 / following-siblings -> tag4
     *                  <tag4 attr="val">   ---> Write locator for tag4
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag22>
     *              <tag4 attr="val">
     *                  Text
     *              </tag4>
     *         </tag31>
     *         text value again
     *     </tag3>
     *     <tag4>
     *         <tag41 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *         </tag41>
     *         <tag42 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *              <tag23 attr22="val22" attr22 attr23="val23">
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag23>
     *         </tag42>
     *         <tag43 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *              <tag22 attr22="val22" attr22 attr23="val23">
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag22>
     *              <tag23 attr22="val22" attr22 attr23="val23">
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag23>
     *         </tag43>
     *         text again
     *     </tag4>
     *     <tag5>
     *         text value again
     *     </tag5>
     * </tag1>
     *
     *
     *
     *
     *
     */
}
