// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupMembershipState Empty = new ThingGroupMembershipState();

    /**
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
     * 
     */
    @Import(name="overrideDynamicGroup")
      private final @Nullable Output<Boolean> overrideDynamicGroup;

    public Output<Boolean> getOverrideDynamicGroup() {
        return this.overrideDynamicGroup == null ? Output.empty() : this.overrideDynamicGroup;
    }

    /**
     * The name of the group to which you are adding a thing.
     * 
     */
    @Import(name="thingGroupName")
      private final @Nullable Output<String> thingGroupName;

    public Output<String> getThingGroupName() {
        return this.thingGroupName == null ? Output.empty() : this.thingGroupName;
    }

    /**
     * The name of the thing to add to a group.
     * 
     */
    @Import(name="thingName")
      private final @Nullable Output<String> thingName;

    public Output<String> getThingName() {
        return this.thingName == null ? Output.empty() : this.thingName;
    }

    public ThingGroupMembershipState(
        @Nullable Output<Boolean> overrideDynamicGroup,
        @Nullable Output<String> thingGroupName,
        @Nullable Output<String> thingName) {
        this.overrideDynamicGroup = overrideDynamicGroup;
        this.thingGroupName = thingGroupName;
        this.thingName = thingName;
    }

    private ThingGroupMembershipState() {
        this.overrideDynamicGroup = Output.empty();
        this.thingGroupName = Output.empty();
        this.thingName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> overrideDynamicGroup;
        private @Nullable Output<String> thingGroupName;
        private @Nullable Output<String> thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideDynamicGroup = defaults.overrideDynamicGroup;
    	      this.thingGroupName = defaults.thingGroupName;
    	      this.thingName = defaults.thingName;
        }

        public Builder overrideDynamicGroup(@Nullable Output<Boolean> overrideDynamicGroup) {
            this.overrideDynamicGroup = overrideDynamicGroup;
            return this;
        }
        public Builder overrideDynamicGroup(@Nullable Boolean overrideDynamicGroup) {
            this.overrideDynamicGroup = Output.ofNullable(overrideDynamicGroup);
            return this;
        }
        public Builder thingGroupName(@Nullable Output<String> thingGroupName) {
            this.thingGroupName = thingGroupName;
            return this;
        }
        public Builder thingGroupName(@Nullable String thingGroupName) {
            this.thingGroupName = Output.ofNullable(thingGroupName);
            return this;
        }
        public Builder thingName(@Nullable Output<String> thingName) {
            this.thingName = thingName;
            return this;
        }
        public Builder thingName(@Nullable String thingName) {
            this.thingName = Output.ofNullable(thingName);
            return this;
        }        public ThingGroupMembershipState build() {
            return new ThingGroupMembershipState(overrideDynamicGroup, thingGroupName, thingName);
        }
    }
}
