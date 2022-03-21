// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FileSystemApplicationLogsConfigResponse {
    /**
     * Log level.
     * 
     */
    private final @Nullable String level;

    @CustomType.Constructor
    private FileSystemApplicationLogsConfigResponse(@CustomType.Parameter("level") @Nullable String level) {
        this.level = level;
    }

    /**
     * Log level.
     * 
    */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemApplicationLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String level;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemApplicationLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
        }

        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }        public FileSystemApplicationLogsConfigResponse build() {
            return new FileSystemApplicationLogsConfigResponse(level);
        }
    }
}
