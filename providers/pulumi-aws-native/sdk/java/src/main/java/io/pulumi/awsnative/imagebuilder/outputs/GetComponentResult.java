// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ComponentType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetComponentResult {
    private final @Nullable String arn;
    private final @Nullable Boolean encrypted;
    private final @Nullable ComponentType type;

    @OutputCustomType.Constructor({"arn","encrypted","type"})
    private GetComponentResult(
        @Nullable String arn,
        @Nullable Boolean encrypted,
        @Nullable ComponentType type) {
        this.arn = arn;
        this.encrypted = encrypted;
        this.type = type;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    public Optional<ComponentType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean encrypted;
        private @Nullable ComponentType type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.encrypted = defaults.encrypted;
    	      this.type = defaults.type;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setType(@Nullable ComponentType type) {
            this.type = type;
            return this;
        }

        public GetComponentResult build() {
            return new GetComponentResult(arn, encrypted, type);
        }
    }
}
