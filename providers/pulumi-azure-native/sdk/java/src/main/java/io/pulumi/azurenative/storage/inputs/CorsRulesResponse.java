// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.CorsRuleResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sets the CORS rules. You can include up to five CorsRule elements in the request.
 * 
 */
public final class CorsRulesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CorsRulesResponse Empty = new CorsRulesResponse();

    /**
     * The List of CORS rules. You can include up to five CorsRule elements in the request.
     * 
     */
    @InputImport(name="corsRules")
    private final @Nullable List<CorsRuleResponse> corsRules;

    public List<CorsRuleResponse> getCorsRules() {
        return this.corsRules == null ? List.of() : this.corsRules;
    }

    public CorsRulesResponse(@Nullable List<CorsRuleResponse> corsRules) {
        this.corsRules = corsRules;
    }

    private CorsRulesResponse() {
        this.corsRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CorsRuleResponse> corsRules;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
        }

        public Builder setCorsRules(@Nullable List<CorsRuleResponse> corsRules) {
            this.corsRules = corsRules;
            return this;
        }

        public CorsRulesResponse build() {
            return new CorsRulesResponse(corsRules);
        }
    }
}
