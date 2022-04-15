// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetComponentVersionResult {
    private final @Nullable String arn;
    private final @Nullable String componentName;
    private final @Nullable String componentVersion;
    private final @Nullable Object tags;

    @CustomType.Constructor
    private GetComponentVersionResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("componentName") @Nullable String componentName,
        @CustomType.Parameter("componentVersion") @Nullable String componentVersion,
        @CustomType.Parameter("tags") @Nullable Object tags) {
        this.arn = arn;
        this.componentName = componentName;
        this.componentVersion = componentVersion;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> componentName() {
        return Optional.ofNullable(this.componentName);
    }
    public Optional<String> componentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }
    public Optional<Object> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String componentName;
        private @Nullable String componentVersion;
        private @Nullable Object tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.componentName = defaults.componentName;
    	      this.componentVersion = defaults.componentVersion;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder componentName(@Nullable String componentName) {
            this.componentName = componentName;
            return this;
        }
        public Builder componentVersion(@Nullable String componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }        public GetComponentVersionResult build() {
            return new GetComponentVersionResult(arn, componentName, componentVersion, tags);
        }
    }
}
