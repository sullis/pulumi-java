// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.enums.ExpressionEvaluationOptionsScopeType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies whether template expressions are evaluated within the scope of the parent template or nested template.
 * 
 */
public final class ExpressionEvaluationOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressionEvaluationOptionsArgs Empty = new ExpressionEvaluationOptionsArgs();

    /**
     * The scope to be used for evaluation of parameters, variables and functions in a nested template.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<Either<String,ExpressionEvaluationOptionsScopeType>> scope;

    public Input<Either<String,ExpressionEvaluationOptionsScopeType>> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public ExpressionEvaluationOptionsArgs(@Nullable Input<Either<String,ExpressionEvaluationOptionsScopeType>> scope) {
        this.scope = scope;
    }

    private ExpressionEvaluationOptionsArgs() {
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressionEvaluationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ExpressionEvaluationOptionsScopeType>> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressionEvaluationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        public Builder setScope(@Nullable Input<Either<String,ExpressionEvaluationOptionsScopeType>> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable Either<String,ExpressionEvaluationOptionsScopeType> scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public ExpressionEvaluationOptionsArgs build() {
            return new ExpressionEvaluationOptionsArgs(scope);
        }
    }
}