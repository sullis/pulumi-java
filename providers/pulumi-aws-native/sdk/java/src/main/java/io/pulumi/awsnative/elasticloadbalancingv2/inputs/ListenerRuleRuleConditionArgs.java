// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHostHeaderConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHttpHeaderConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHttpRequestMethodConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRulePathPatternConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleQueryStringConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleSourceIpConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleRuleConditionArgs Empty = new ListenerRuleRuleConditionArgs();

    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    @InputImport(name="hostHeaderConfig")
    private final @Nullable Input<ListenerRuleHostHeaderConfigArgs> hostHeaderConfig;

    public Input<ListenerRuleHostHeaderConfigArgs> getHostHeaderConfig() {
        return this.hostHeaderConfig == null ? Input.empty() : this.hostHeaderConfig;
    }

    @InputImport(name="httpHeaderConfig")
    private final @Nullable Input<ListenerRuleHttpHeaderConfigArgs> httpHeaderConfig;

    public Input<ListenerRuleHttpHeaderConfigArgs> getHttpHeaderConfig() {
        return this.httpHeaderConfig == null ? Input.empty() : this.httpHeaderConfig;
    }

    @InputImport(name="httpRequestMethodConfig")
    private final @Nullable Input<ListenerRuleHttpRequestMethodConfigArgs> httpRequestMethodConfig;

    public Input<ListenerRuleHttpRequestMethodConfigArgs> getHttpRequestMethodConfig() {
        return this.httpRequestMethodConfig == null ? Input.empty() : this.httpRequestMethodConfig;
    }

    @InputImport(name="pathPatternConfig")
    private final @Nullable Input<ListenerRulePathPatternConfigArgs> pathPatternConfig;

    public Input<ListenerRulePathPatternConfigArgs> getPathPatternConfig() {
        return this.pathPatternConfig == null ? Input.empty() : this.pathPatternConfig;
    }

    @InputImport(name="queryStringConfig")
    private final @Nullable Input<ListenerRuleQueryStringConfigArgs> queryStringConfig;

    public Input<ListenerRuleQueryStringConfigArgs> getQueryStringConfig() {
        return this.queryStringConfig == null ? Input.empty() : this.queryStringConfig;
    }

    @InputImport(name="sourceIpConfig")
    private final @Nullable Input<ListenerRuleSourceIpConfigArgs> sourceIpConfig;

    public Input<ListenerRuleSourceIpConfigArgs> getSourceIpConfig() {
        return this.sourceIpConfig == null ? Input.empty() : this.sourceIpConfig;
    }

    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ListenerRuleRuleConditionArgs(
        @Nullable Input<String> field,
        @Nullable Input<ListenerRuleHostHeaderConfigArgs> hostHeaderConfig,
        @Nullable Input<ListenerRuleHttpHeaderConfigArgs> httpHeaderConfig,
        @Nullable Input<ListenerRuleHttpRequestMethodConfigArgs> httpRequestMethodConfig,
        @Nullable Input<ListenerRulePathPatternConfigArgs> pathPatternConfig,
        @Nullable Input<ListenerRuleQueryStringConfigArgs> queryStringConfig,
        @Nullable Input<ListenerRuleSourceIpConfigArgs> sourceIpConfig,
        @Nullable Input<List<String>> values) {
        this.field = field;
        this.hostHeaderConfig = hostHeaderConfig;
        this.httpHeaderConfig = httpHeaderConfig;
        this.httpRequestMethodConfig = httpRequestMethodConfig;
        this.pathPatternConfig = pathPatternConfig;
        this.queryStringConfig = queryStringConfig;
        this.sourceIpConfig = sourceIpConfig;
        this.values = values;
    }

    private ListenerRuleRuleConditionArgs() {
        this.field = Input.empty();
        this.hostHeaderConfig = Input.empty();
        this.httpHeaderConfig = Input.empty();
        this.httpRequestMethodConfig = Input.empty();
        this.pathPatternConfig = Input.empty();
        this.queryStringConfig = Input.empty();
        this.sourceIpConfig = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> field;
        private @Nullable Input<ListenerRuleHostHeaderConfigArgs> hostHeaderConfig;
        private @Nullable Input<ListenerRuleHttpHeaderConfigArgs> httpHeaderConfig;
        private @Nullable Input<ListenerRuleHttpRequestMethodConfigArgs> httpRequestMethodConfig;
        private @Nullable Input<ListenerRulePathPatternConfigArgs> pathPatternConfig;
        private @Nullable Input<ListenerRuleQueryStringConfigArgs> queryStringConfig;
        private @Nullable Input<ListenerRuleSourceIpConfigArgs> sourceIpConfig;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.hostHeaderConfig = defaults.hostHeaderConfig;
    	      this.httpHeaderConfig = defaults.httpHeaderConfig;
    	      this.httpRequestMethodConfig = defaults.httpRequestMethodConfig;
    	      this.pathPatternConfig = defaults.pathPatternConfig;
    	      this.queryStringConfig = defaults.queryStringConfig;
    	      this.sourceIpConfig = defaults.sourceIpConfig;
    	      this.values = defaults.values;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setHostHeaderConfig(@Nullable Input<ListenerRuleHostHeaderConfigArgs> hostHeaderConfig) {
            this.hostHeaderConfig = hostHeaderConfig;
            return this;
        }

        public Builder setHostHeaderConfig(@Nullable ListenerRuleHostHeaderConfigArgs hostHeaderConfig) {
            this.hostHeaderConfig = Input.ofNullable(hostHeaderConfig);
            return this;
        }

        public Builder setHttpHeaderConfig(@Nullable Input<ListenerRuleHttpHeaderConfigArgs> httpHeaderConfig) {
            this.httpHeaderConfig = httpHeaderConfig;
            return this;
        }

        public Builder setHttpHeaderConfig(@Nullable ListenerRuleHttpHeaderConfigArgs httpHeaderConfig) {
            this.httpHeaderConfig = Input.ofNullable(httpHeaderConfig);
            return this;
        }

        public Builder setHttpRequestMethodConfig(@Nullable Input<ListenerRuleHttpRequestMethodConfigArgs> httpRequestMethodConfig) {
            this.httpRequestMethodConfig = httpRequestMethodConfig;
            return this;
        }

        public Builder setHttpRequestMethodConfig(@Nullable ListenerRuleHttpRequestMethodConfigArgs httpRequestMethodConfig) {
            this.httpRequestMethodConfig = Input.ofNullable(httpRequestMethodConfig);
            return this;
        }

        public Builder setPathPatternConfig(@Nullable Input<ListenerRulePathPatternConfigArgs> pathPatternConfig) {
            this.pathPatternConfig = pathPatternConfig;
            return this;
        }

        public Builder setPathPatternConfig(@Nullable ListenerRulePathPatternConfigArgs pathPatternConfig) {
            this.pathPatternConfig = Input.ofNullable(pathPatternConfig);
            return this;
        }

        public Builder setQueryStringConfig(@Nullable Input<ListenerRuleQueryStringConfigArgs> queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }

        public Builder setQueryStringConfig(@Nullable ListenerRuleQueryStringConfigArgs queryStringConfig) {
            this.queryStringConfig = Input.ofNullable(queryStringConfig);
            return this;
        }

        public Builder setSourceIpConfig(@Nullable Input<ListenerRuleSourceIpConfigArgs> sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }

        public Builder setSourceIpConfig(@Nullable ListenerRuleSourceIpConfigArgs sourceIpConfig) {
            this.sourceIpConfig = Input.ofNullable(sourceIpConfig);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public ListenerRuleRuleConditionArgs build() {
            return new ListenerRuleRuleConditionArgs(field, hostHeaderConfig, httpHeaderConfig, httpRequestMethodConfig, pathPatternConfig, queryStringConfig, sourceIpConfig, values);
        }
    }
}
