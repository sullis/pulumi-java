// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KpiExtractResponse {
    /**
     * The expression.
     * 
     */
    private final String expression;
    /**
     * KPI extract name.
     * 
     */
    private final String extractName;

    @OutputCustomType.Constructor({"expression","extractName"})
    private KpiExtractResponse(
        String expression,
        String extractName) {
        this.expression = Objects.requireNonNull(expression);
        this.extractName = Objects.requireNonNull(extractName);
    }

    /**
     * The expression.
     * 
     */
    public String getExpression() {
        return this.expression;
    }
    /**
     * KPI extract name.
     * 
     */
    public String getExtractName() {
        return this.extractName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiExtractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private String extractName;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiExtractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.extractName = defaults.extractName;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExtractName(String extractName) {
            this.extractName = Objects.requireNonNull(extractName);
            return this;
        }

        public KpiExtractResponse build() {
            return new KpiExtractResponse(expression, extractName);
        }
    }
}
