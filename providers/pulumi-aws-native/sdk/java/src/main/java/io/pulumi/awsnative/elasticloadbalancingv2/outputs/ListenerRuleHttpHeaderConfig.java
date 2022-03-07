// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleHttpHeaderConfig {
    private final @Nullable String httpHeaderName;
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"httpHeaderName","values"})
    private ListenerRuleHttpHeaderConfig(
        @Nullable String httpHeaderName,
        @Nullable List<String> values) {
        this.httpHeaderName = httpHeaderName;
        this.values = values;
    }

    public Optional<String> getHttpHeaderName() {
        return Optional.ofNullable(this.httpHeaderName);
    }
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleHttpHeaderConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpHeaderName;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleHttpHeaderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.values = defaults.values;
        }

        public Builder setHttpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ListenerRuleHttpHeaderConfig build() {
            return new ListenerRuleHttpHeaderConfig(httpHeaderName, values);
        }
    }
}