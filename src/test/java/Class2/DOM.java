package Class2;

public class DOM {
    /**
     * DOM (Document Object Model)
     *      - It's a html document
     *
     * Every webpage is a html document.
     * <html>
     *     <head>
     *         ...
     *         ...
     *     </head>
     *     <body>
     *         ...
     *         ...
     *     </body>
     * </html>
     *
     * Code -> generates DOM (html-document) -> creates webpage
     */
    /**
     * Tag introduction:
     * <abcd>   -> starting of abcd-tag
     *
     * </abcd>  -> closing of abcd-tag
     *
     *
     * <html>       -> starting of html-tag
     *     <head>   -> starting of head-tag
     *         ...
     *         ...
     *     </head>  -> closing of head-tag
     *     <body>   -> starting of body-tag
     *         ...
     *         ...
     *     </body>  -> closing of body-tag
     * </html>      -> closing of html-tag
     *
     * Note: TagNames CANNOT have spaces (it'll ALWAYS be one-word).
     * Examples: html, head, body, script, link, div, meta, style
     */
    /**
     * Tags in detail:
     *
     * <tag1>
     * <tag1 a="1" b="2" c="3" d="4" e="5">
     *    tagName = tag1 (Tag-names cannot have spaces)
     *    attributes of tag1 = a, b, c, d, e
     *    a-attribute of tag1 has value = "1"
     *    b-attribute of tag1 has value = "2"
     *    c-attribute of tag1 has value = "3"
     *    d-attribute of tag1 has value = "4"
     *    e-attribute of tag1 has value = "5"
     *
     * NOTE: attribute-names CANNOT have spaces.
     *       attributes MAY have a value
     *
     * <tag1 a="1" b="2" c d="4" e="5">
     *    tagName = tag1 (Tag-names cannot have spaces)
     *    attributes of tag1 = a, b, c, d, e
     *    a-attribute of tag1 has value = "1"
     *    b-attribute of tag1 has value = "2"
     *    c-attribute of tag1 has value = NO VALUE
     *    d-attribute of tag1 has value = "4"
     *    e-attribute of tag1 has value = "5"
     *
     *
     * <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"
     *      name="firstname" value aria-required="true" placeholder aria-label="First name"
     *      id="u_0_8_Bz">
     * tagName -> input
     * attributes of input-tag -> type, class, data-type, name, value, aria-required, placeholder, aria-label, id
     * type attribute of input-tag has value = "text"
     * class attribute of input-tag has value = "inputtext _58mg _5dba _2ph-"
     * data-type attribute of input-tag has value = "text"
     * name attribute of input-tag has value = "firstname"
     * value attribute of input-tag has value = ""
     * aria-required attribute of input-tag has value = "true"
     * placeholder attribute of input-tag has value = ""
     * aria-label attribute of input-tag has value = "First name"
     *
     *
     * <tag1 a="1" b="2" c="3" d="4" e="5">     -> starting of tag1
     *     "data"                               -> text of tag1
     * </tag1>                                  -> closing of tag1
     *
     *
     * NOTE: Any text in between the starting-tag and closing-tag is called Text of the tag.
     *
     * Example:
     * <h2 class="_8eso">                                               -> starting of h2-tag
     *     Connect with friends and the world around you on Facebook.   -> text of h2-tag
     * </h2>                                                            -> closing of h2-tag
     *
     *
     *
     * <tag1 attr1="val1" attr2="val2" attr3 attr4="val4">
     *      <tag2>
     *          <tag4>
     *              ...
     *          </tag4>
     *          <tag3>
     *              Text value3
     *          </tag3>
     *          Text value2
     *      </tag2>
     *      <tag3 attr13="val13">
     *          <tag5>
     *              ...
     *          </tag5>
     *      </tag3>
     *      Text value1
     * </tag1>
     *
     * text of tag1 -> "Text value1"
     * tags which are directly present in tag1 -> tag2, tag3
     * tags which are directly present in tag2 (which is directly inside tag1) -> tag4, tag3
     * tags which are directly present in tag3 (which is directly inside tag1) -> tag5
     *
     * attributes of tag1 -> attr1, attr2, attr3, attr4
     * attributes of tag2 (which is directly inside tag1) -> no attributes
     * attributes of tag3 (which is directly inside tag1) -> attr13
     * attributes of tag4 (which is directly inside tag2) -> no attributes
     * attributes of tag3 (which is directly inside tag2) -> no attributes
     * attributes of tag5 (which is directly inside tag3) -> no attributes
     *
     * text of tag1 -> "Text value1"
     * text of tag2 -> "Text value2"
     * text of tag3 -> No Text-value
     * text of tag4 (which is directly inside tag2) -> No Text-value
     * text of tag3 (which is directly inside tag2) -> Text value3
     * text of tag5 (which is directly inside tag3) -> No Text-value
     *
     *
     * <tag1 attr1="val1" attr2="val2" attr3 attr4="val4">
     *      <tag2>
     *          <tag4>
     *              ...
     *          </tag4>
     *          <tag3>
     *              Text value3
     *          </tag3>
     *          Text value2
     *      </tag2>
     *      <tag3 attr13="val13">
     *          <tag5>
     *              <tag6>
     *                  ...
     *              </tag6>
     *              ...
     *          </tag5>
     *      </tag3>
     *      Text value1
     * </tag1>
     *
     * Directly-inside tag is known as Child-tag
     * tag1 has 2-child -> tag2, tag3
     * tag2 has 2-child -> tag4, tag3
     * tag3 has 1-child -> tag5
     * tag5 has 1-child -> tag6
     *
     */
}
