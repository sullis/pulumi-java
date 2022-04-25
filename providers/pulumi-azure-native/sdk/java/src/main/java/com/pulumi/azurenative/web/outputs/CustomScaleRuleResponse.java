// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ScaleRuleAuthResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomScaleRuleResponse {
    /**
     * @return Authentication secrets for the custom scale rule.
     * 
     */
    private final @Nullable List<ScaleRuleAuthResponse> auth;
    /**
     * @return Metadata properties to describe custom scale rule.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * @return Type of the custom scale rule
     * eg: azure-servicebus, redis etc.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private CustomScaleRuleResponse(
        @CustomType.Parameter("auth") @Nullable List<ScaleRuleAuthResponse> auth,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("type") @Nullable String type) {
        this.auth = auth;
        this.metadata = metadata;
        this.type = type;
    }

    /**
     * @return Authentication secrets for the custom scale rule.
     * 
     */
    public List<ScaleRuleAuthResponse> auth() {
        return this.auth == null ? List.of() : this.auth;
    }
    /**
     * @return Metadata properties to describe custom scale rule.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * @return Type of the custom scale rule
     * eg: azure-servicebus, redis etc.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScaleRuleAuthResponse> auth;
        private @Nullable Map<String,String> metadata;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder auth(@Nullable List<ScaleRuleAuthResponse> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(ScaleRuleAuthResponse... auth) {
            return auth(List.of(auth));
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public CustomScaleRuleResponse build() {
            return new CustomScaleRuleResponse(auth, metadata, type);
        }
    }
}
