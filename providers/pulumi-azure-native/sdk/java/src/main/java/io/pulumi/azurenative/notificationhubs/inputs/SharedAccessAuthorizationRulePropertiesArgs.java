// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.azurenative.notificationhubs.enums.AccessRights;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SharedAccessAuthorizationRule properties.
 * 
 */
public final class SharedAccessAuthorizationRulePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedAccessAuthorizationRulePropertiesArgs Empty = new SharedAccessAuthorizationRulePropertiesArgs();

    /**
     * The rights associated with the rule.
     * 
     */
    @InputImport(name="rights")
    private final @Nullable Input<List<AccessRights>> rights;

    public Input<List<AccessRights>> getRights() {
        return this.rights == null ? Input.empty() : this.rights;
    }

    public SharedAccessAuthorizationRulePropertiesArgs(@Nullable Input<List<AccessRights>> rights) {
        this.rights = rights;
    }

    private SharedAccessAuthorizationRulePropertiesArgs() {
        this.rights = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedAccessAuthorizationRulePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AccessRights>> rights;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedAccessAuthorizationRulePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rights = defaults.rights;
        }

        public Builder setRights(@Nullable Input<List<AccessRights>> rights) {
            this.rights = rights;
            return this;
        }

        public Builder setRights(@Nullable List<AccessRights> rights) {
            this.rights = Input.ofNullable(rights);
            return this;
        }

        public SharedAccessAuthorizationRulePropertiesArgs build() {
            return new SharedAccessAuthorizationRulePropertiesArgs(rights);
        }
    }
}
