// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.WebAclDefaultActionGetArgs;
import io.pulumi.aws.waf.inputs.WebAclLoggingConfigurationGetArgs;
import io.pulumi.aws.waf.inputs.WebAclRuleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclState extends io.pulumi.resources.ResourceArgs {

    public static final WebAclState Empty = new WebAclState();

    /**
     * The ARN of the WAF WebACL.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * 
     */
    @InputImport(name="defaultAction")
      private final @Nullable Input<WebAclDefaultActionGetArgs> defaultAction;

    public Input<WebAclDefaultActionGetArgs> getDefaultAction() {
        return this.defaultAction == null ? Input.empty() : this.defaultAction;
    }

    /**
     * Configuration block to enable WAF logging. Detailed below.
     * 
     */
    @InputImport(name="loggingConfiguration")
      private final @Nullable Input<WebAclLoggingConfigurationGetArgs> loggingConfiguration;

    public Input<WebAclLoggingConfigurationGetArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Input.empty() : this.loggingConfiguration;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    @InputImport(name="metricName")
      private final @Nullable Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName == null ? Input.empty() : this.metricName;
    }

    /**
     * The name or description of the web ACL.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<WebAclRuleGetArgs>> rules;

    public Input<List<WebAclRuleGetArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public WebAclState(
        @Nullable Input<String> arn,
        @Nullable Input<WebAclDefaultActionGetArgs> defaultAction,
        @Nullable Input<WebAclLoggingConfigurationGetArgs> loggingConfiguration,
        @Nullable Input<String> metricName,
        @Nullable Input<String> name,
        @Nullable Input<List<WebAclRuleGetArgs>> rules,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.defaultAction = defaultAction;
        this.loggingConfiguration = loggingConfiguration;
        this.metricName = metricName;
        this.name = name;
        this.rules = rules;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private WebAclState() {
        this.arn = Input.empty();
        this.defaultAction = Input.empty();
        this.loggingConfiguration = Input.empty();
        this.metricName = Input.empty();
        this.name = Input.empty();
        this.rules = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<WebAclDefaultActionGetArgs> defaultAction;
        private @Nullable Input<WebAclLoggingConfigurationGetArgs> loggingConfiguration;
        private @Nullable Input<String> metricName;
        private @Nullable Input<String> name;
        private @Nullable Input<List<WebAclRuleGetArgs>> rules;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultAction = defaults.defaultAction;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDefaultAction(@Nullable Input<WebAclDefaultActionGetArgs> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setDefaultAction(@Nullable WebAclDefaultActionGetArgs defaultAction) {
            this.defaultAction = Input.ofNullable(defaultAction);
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable Input<WebAclLoggingConfigurationGetArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable WebAclLoggingConfigurationGetArgs loggingConfiguration) {
            this.loggingConfiguration = Input.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder setMetricName(@Nullable Input<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder setMetricName(@Nullable String metricName) {
            this.metricName = Input.ofNullable(metricName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRules(@Nullable Input<List<WebAclRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<WebAclRuleGetArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public WebAclState build() {
            return new WebAclState(arn, defaultAction, loggingConfiguration, metricName, name, rules, tags, tagsAll);
        }
    }
}