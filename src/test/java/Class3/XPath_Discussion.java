package Class3;

public class XPath_Discussion {
    /**
     * <tag1 attr1="val1" attr2="val2" attr3 attr4="val4">
     *      <tag2>
     *          <tag4>
     *              <tag11>
     *                  ...
     *              </tag11>
     *          </tag4>
     *          <tag33>
     *              Text value3
     *          </tag33>
     *          <tag5>
     *              Text value5
     *          </tag5>
     *          <tag6>
     *              Text value6
     *          </tag6>
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
     * tags which are directly present in tag1 -> tag2, tag3
     *      tag1 is the parent of tag2 and tag3
     *      tag2 and tag3 are children of tag1 (tag2 and tag3 are sibling, bcz they have same parent-tag1)
     * tags which are directly present in tag2 (which is directly inside tag1) -> tag4, tag3
     *      tag4 and tag3 are children of tag2 (tag4 and tag3 are sibling, bcz they have same parent-tag2)
     * tags which are directly present in tag3 (which is directly inside tag1) -> tag5
     *
     * Following-sibling: Any sibling-tag which appears in the dom after the tag
     * Preceding-sibling: Any sibling-tag which appears in the dom before the tag
     *
     * following-sibling of tag33
     * (which sibling-tags appear after
     *      the tag33 in the dom): tag5, tag6
     *
     * preceding-sibling of tag33
     * (which sibling-tags appear before
     *      the tag33 in the dom): tag4
     *
     *
     */
}
