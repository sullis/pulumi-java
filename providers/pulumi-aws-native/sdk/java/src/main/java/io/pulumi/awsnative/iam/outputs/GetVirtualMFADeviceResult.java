// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.outputs;

import io.pulumi.awsnative.iam.outputs.VirtualMFADeviceTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualMFADeviceResult {
    private final @Nullable String serialNumber;
    private final @Nullable List<VirtualMFADeviceTag> tags;
    private final @Nullable List<String> users;

    @OutputCustomType.Constructor({"serialNumber","tags","users"})
    private GetVirtualMFADeviceResult(
        @Nullable String serialNumber,
        @Nullable List<VirtualMFADeviceTag> tags,
        @Nullable List<String> users) {
        this.serialNumber = serialNumber;
        this.tags = tags;
        this.users = users;
    }

    public Optional<String> getSerialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    public List<VirtualMFADeviceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<String> getUsers() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMFADeviceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serialNumber;
        private @Nullable List<VirtualMFADeviceTag> tags;
        private @Nullable List<String> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMFADeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serialNumber = defaults.serialNumber;
    	      this.tags = defaults.tags;
    	      this.users = defaults.users;
        }

        public Builder setSerialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setTags(@Nullable List<VirtualMFADeviceTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUsers(@Nullable List<String> users) {
            this.users = users;
            return this;
        }

        public GetVirtualMFADeviceResult build() {
            return new GetVirtualMFADeviceResult(serialNumber, tags, users);
        }
    }
}
