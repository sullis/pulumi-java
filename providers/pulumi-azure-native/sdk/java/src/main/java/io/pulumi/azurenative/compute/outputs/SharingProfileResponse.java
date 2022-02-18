// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SharingProfileGroupResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SharingProfileResponse {
    /**
     * A list of sharing profile groups.
     * 
     */
    private final List<SharingProfileGroupResponse> groups;
    /**
     * This property allows you to specify the permission of sharing gallery. <br><br> Possible values are: <br><br> **Private** <br><br> **Groups**
     * 
     */
    private final @Nullable String permissions;

    @OutputCustomType.Constructor({"groups","permissions"})
    private SharingProfileResponse(
        List<SharingProfileGroupResponse> groups,
        @Nullable String permissions) {
        this.groups = Objects.requireNonNull(groups);
        this.permissions = permissions;
    }

    /**
     * A list of sharing profile groups.
     * 
     */
    public List<SharingProfileGroupResponse> getGroups() {
        return this.groups;
    }
    /**
     * This property allows you to specify the permission of sharing gallery. <br><br> Possible values are: <br><br> **Private** <br><br> **Groups**
     * 
     */
    public Optional<String> getPermissions() {
        return Optional.ofNullable(this.permissions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SharingProfileGroupResponse> groups;
        private @Nullable String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(SharingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.permissions = defaults.permissions;
        }

        public Builder setGroups(List<SharingProfileGroupResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setPermissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }

        public SharingProfileResponse build() {
            return new SharingProfileResponse(groups, permissions);
        }
    }
}
