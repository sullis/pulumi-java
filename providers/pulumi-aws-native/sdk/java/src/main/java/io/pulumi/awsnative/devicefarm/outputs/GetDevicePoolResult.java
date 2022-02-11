// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.outputs;

import io.pulumi.awsnative.devicefarm.outputs.DevicePoolRule;
import io.pulumi.awsnative.devicefarm.outputs.DevicePoolTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDevicePoolResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable Integer maxDevices;
    private final @Nullable String name;
    private final @Nullable List<DevicePoolRule> rules;
    private final @Nullable List<DevicePoolTag> tags;

    @OutputCustomType.Constructor({"arn","description","maxDevices","name","rules","tags"})
    private GetDevicePoolResult(
        @Nullable String arn,
        @Nullable String description,
        @Nullable Integer maxDevices,
        @Nullable String name,
        @Nullable List<DevicePoolRule> rules,
        @Nullable List<DevicePoolTag> tags) {
        this.arn = arn;
        this.description = description;
        this.maxDevices = maxDevices;
        this.name = name;
        this.rules = rules;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Integer> getMaxDevices() {
        return Optional.ofNullable(this.maxDevices);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<DevicePoolRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    public List<DevicePoolTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicePoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable Integer maxDevices;
        private @Nullable String name;
        private @Nullable List<DevicePoolRule> rules;
        private @Nullable List<DevicePoolTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDevicePoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.maxDevices = defaults.maxDevices;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setMaxDevices(@Nullable Integer maxDevices) {
            this.maxDevices = maxDevices;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRules(@Nullable List<DevicePoolRule> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setTags(@Nullable List<DevicePoolTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDevicePoolResult build() {
            return new GetDevicePoolResult(arn, description, maxDevices, name, rules, tags);
        }
    }
}
