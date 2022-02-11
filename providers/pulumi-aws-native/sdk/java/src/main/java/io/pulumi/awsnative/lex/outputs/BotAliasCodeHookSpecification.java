// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotAliasLambdaCodeHook;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class BotAliasCodeHookSpecification {
    private final BotAliasLambdaCodeHook lambdaCodeHook;

    @OutputCustomType.Constructor({"lambdaCodeHook"})
    private BotAliasCodeHookSpecification(BotAliasLambdaCodeHook lambdaCodeHook) {
        this.lambdaCodeHook = Objects.requireNonNull(lambdaCodeHook);
    }

    public BotAliasLambdaCodeHook getLambdaCodeHook() {
        return this.lambdaCodeHook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasCodeHookSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasLambdaCodeHook lambdaCodeHook;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasCodeHookSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaCodeHook = defaults.lambdaCodeHook;
        }

        public Builder setLambdaCodeHook(BotAliasLambdaCodeHook lambdaCodeHook) {
            this.lambdaCodeHook = Objects.requireNonNull(lambdaCodeHook);
            return this;
        }

        public BotAliasCodeHookSpecification build() {
            return new BotAliasCodeHookSpecification(lambdaCodeHook);
        }
    }
}
