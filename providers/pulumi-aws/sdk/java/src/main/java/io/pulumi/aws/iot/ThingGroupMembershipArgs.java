// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupMembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupMembershipArgs Empty = new ThingGroupMembershipArgs();

    /**
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
     * 
     */
    @InputImport(name="overrideDynamicGroup")
      private final @Nullable Input<Boolean> overrideDynamicGroup;

    public Input<Boolean> getOverrideDynamicGroup() {
        return this.overrideDynamicGroup == null ? Input.empty() : this.overrideDynamicGroup;
    }

    /**
     * The name of the group to which you are adding a thing.
     * 
     */
    @InputImport(name="thingGroupName", required=true)
      private final Input<String> thingGroupName;

    public Input<String> getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * The name of the thing to add to a group.
     * 
     */
    @InputImport(name="thingName", required=true)
      private final Input<String> thingName;

    public Input<String> getThingName() {
        return this.thingName;
    }

    public ThingGroupMembershipArgs(
        @Nullable Input<Boolean> overrideDynamicGroup,
        Input<String> thingGroupName,
        Input<String> thingName) {
        this.overrideDynamicGroup = overrideDynamicGroup;
        this.thingGroupName = Objects.requireNonNull(thingGroupName, "expected parameter 'thingGroupName' to be non-null");
        this.thingName = Objects.requireNonNull(thingName, "expected parameter 'thingName' to be non-null");
    }

    private ThingGroupMembershipArgs() {
        this.overrideDynamicGroup = Input.empty();
        this.thingGroupName = Input.empty();
        this.thingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> overrideDynamicGroup;
        private Input<String> thingGroupName;
        private Input<String> thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideDynamicGroup = defaults.overrideDynamicGroup;
    	      this.thingGroupName = defaults.thingGroupName;
    	      this.thingName = defaults.thingName;
        }

        public Builder setOverrideDynamicGroup(@Nullable Input<Boolean> overrideDynamicGroup) {
            this.overrideDynamicGroup = overrideDynamicGroup;
            return this;
        }

        public Builder setOverrideDynamicGroup(@Nullable Boolean overrideDynamicGroup) {
            this.overrideDynamicGroup = Input.ofNullable(overrideDynamicGroup);
            return this;
        }

        public Builder setThingGroupName(Input<String> thingGroupName) {
            this.thingGroupName = Objects.requireNonNull(thingGroupName);
            return this;
        }

        public Builder setThingGroupName(String thingGroupName) {
            this.thingGroupName = Input.of(Objects.requireNonNull(thingGroupName));
            return this;
        }

        public Builder setThingName(Input<String> thingName) {
            this.thingName = Objects.requireNonNull(thingName);
            return this;
        }

        public Builder setThingName(String thingName) {
            this.thingName = Input.of(Objects.requireNonNull(thingName));
            return this;
        }
        public ThingGroupMembershipArgs build() {
            return new ThingGroupMembershipArgs(overrideDynamicGroup, thingGroupName, thingName);
        }
    }
}