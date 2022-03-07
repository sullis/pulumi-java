// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of group resource.
 * 
 */
public final class GroupPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupPropertiesArgs Empty = new GroupPropertiesArgs();

    /**
     * The type of group.
     * 
     */
    @InputImport(name="groupType")
      private final @Nullable Input<String> groupType;

    public Input<String> getGroupType() {
        return this.groupType == null ? Input.empty() : this.groupType;
    }

    public GroupPropertiesArgs(@Nullable Input<String> groupType) {
        this.groupType = groupType;
    }

    private GroupPropertiesArgs() {
        this.groupType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupType;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupType = defaults.groupType;
        }

        public Builder setGroupType(@Nullable Input<String> groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder setGroupType(@Nullable String groupType) {
            this.groupType = Input.ofNullable(groupType);
            return this;
        }
        public GroupPropertiesArgs build() {
            return new GroupPropertiesArgs(groupType);
        }
    }
}