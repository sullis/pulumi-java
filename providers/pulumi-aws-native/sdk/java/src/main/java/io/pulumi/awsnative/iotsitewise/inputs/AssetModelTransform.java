// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelExpressionVariable;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AssetModelTransform extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelTransform Empty = new AssetModelTransform();

    @InputImport(name="expression", required=true)
    private final String expression;

    public String getExpression() {
        return this.expression;
    }

    @InputImport(name="variables", required=true)
    private final List<AssetModelExpressionVariable> variables;

    public List<AssetModelExpressionVariable> getVariables() {
        return this.variables;
    }

    public AssetModelTransform(
        String expression,
        List<AssetModelExpressionVariable> variables) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.variables = Objects.requireNonNull(variables, "expected parameter 'variables' to be non-null");
    }

    private AssetModelTransform() {
        this.expression = null;
        this.variables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelTransform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private List<AssetModelExpressionVariable> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelTransform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setVariables(List<AssetModelExpressionVariable> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }

        public AssetModelTransform build() {
            return new AssetModelTransform(expression, variables);
        }
    }
}
