// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse;
import com.pulumi.googlenative.orgpolicy_v2.inputs.GoogleTypeExprResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A rule used to express this policy.
 * 
 */
public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse Empty = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse();

    /**
     * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="allowAll", required=true)
    private Boolean allowAll;

    /**
     * @return Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
     */
    public Boolean allowAll() {
        return this.allowAll;
    }

    /**
     * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
     * 
     */
    @Import(name="condition", required=true)
    private GoogleTypeExprResponse condition;

    /**
     * @return A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
     * 
     */
    public GoogleTypeExprResponse condition() {
        return this.condition;
    }

    /**
     * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="denyAll", required=true)
    private Boolean denyAll;

    /**
     * @return Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
     */
    public Boolean denyAll() {
        return this.denyAll;
    }

    /**
     * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
     */
    @Import(name="enforce", required=true)
    private Boolean enforce;

    /**
     * @return If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
     */
    public Boolean enforce() {
        return this.enforce;
    }

    /**
     * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="values", required=true)
    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values;

    /**
     * @return List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
     */
    public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values() {
        return this.values;
    }

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse() {}

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse $) {
        this.allowAll = $.allowAll;
        this.condition = $.condition;
        this.denyAll = $.denyAll;
        this.enforce = $.enforce;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse $;

        public Builder() {
            $ = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse();
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse defaults) {
            $ = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowAll Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
         * 
         * @return builder
         * 
         */
        public Builder allowAll(Boolean allowAll) {
            $.allowAll = allowAll;
            return this;
        }

        /**
         * @param condition A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
         * 
         * @return builder
         * 
         */
        public Builder condition(GoogleTypeExprResponse condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param denyAll Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
         * 
         * @return builder
         * 
         */
        public Builder denyAll(Boolean denyAll) {
            $.denyAll = denyAll;
            return this;
        }

        /**
         * @param enforce If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
         * 
         * @return builder
         * 
         */
        public Builder enforce(Boolean enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param values List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
         * 
         * @return builder
         * 
         */
        public Builder values(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values) {
            $.values = values;
            return this;
        }

        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse build() {
            $.allowAll = Objects.requireNonNull($.allowAll, "expected parameter 'allowAll' to be non-null");
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.denyAll = Objects.requireNonNull($.denyAll, "expected parameter 'denyAll' to be non-null");
            $.enforce = Objects.requireNonNull($.enforce, "expected parameter 'enforce' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
