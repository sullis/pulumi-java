// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyFilterRuleCollectionActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the FirewallPolicyFilterRuleCollectionAction.
 * 
 */
public final class FirewallPolicyFilterRuleCollectionActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFilterRuleCollectionActionArgs Empty = new FirewallPolicyFilterRuleCollectionActionArgs();

    /**
     * The type of action.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,FirewallPolicyFilterRuleCollectionActionType>> type;

    public Input<Either<String,FirewallPolicyFilterRuleCollectionActionType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public FirewallPolicyFilterRuleCollectionActionArgs(@Nullable Input<Either<String,FirewallPolicyFilterRuleCollectionActionType>> type) {
        this.type = type;
    }

    private FirewallPolicyFilterRuleCollectionActionArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleCollectionActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,FirewallPolicyFilterRuleCollectionActionType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleCollectionActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,FirewallPolicyFilterRuleCollectionActionType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,FirewallPolicyFilterRuleCollectionActionType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public FirewallPolicyFilterRuleCollectionActionArgs build() {
            return new FirewallPolicyFilterRuleCollectionActionArgs(type);
        }
    }
}