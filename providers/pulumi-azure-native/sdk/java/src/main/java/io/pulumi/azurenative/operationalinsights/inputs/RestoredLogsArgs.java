// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Restore parameters.
 * 
 */
public final class RestoredLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestoredLogsArgs Empty = new RestoredLogsArgs();

    /**
     * The timestamp to end the restore by (UTC).
     * 
     */
    @InputImport(name="endRestoreTime")
      private final @Nullable Input<String> endRestoreTime;

    public Input<String> getEndRestoreTime() {
        return this.endRestoreTime == null ? Input.empty() : this.endRestoreTime;
    }

    /**
     * The timestamp to start the restore from (UTC).
     * 
     */
    @InputImport(name="startRestoreTime")
      private final @Nullable Input<String> startRestoreTime;

    public Input<String> getStartRestoreTime() {
        return this.startRestoreTime == null ? Input.empty() : this.startRestoreTime;
    }

    public RestoredLogsArgs(
        @Nullable Input<String> endRestoreTime,
        @Nullable Input<String> startRestoreTime) {
        this.endRestoreTime = endRestoreTime;
        this.startRestoreTime = startRestoreTime;
    }

    private RestoredLogsArgs() {
        this.endRestoreTime = Input.empty();
        this.startRestoreTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestoredLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endRestoreTime;
        private @Nullable Input<String> startRestoreTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RestoredLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endRestoreTime = defaults.endRestoreTime;
    	      this.startRestoreTime = defaults.startRestoreTime;
        }

        public Builder setEndRestoreTime(@Nullable Input<String> endRestoreTime) {
            this.endRestoreTime = endRestoreTime;
            return this;
        }

        public Builder setEndRestoreTime(@Nullable String endRestoreTime) {
            this.endRestoreTime = Input.ofNullable(endRestoreTime);
            return this;
        }

        public Builder setStartRestoreTime(@Nullable Input<String> startRestoreTime) {
            this.startRestoreTime = startRestoreTime;
            return this;
        }

        public Builder setStartRestoreTime(@Nullable String startRestoreTime) {
            this.startRestoreTime = Input.ofNullable(startRestoreTime);
            return this;
        }
        public RestoredLogsArgs build() {
            return new RestoredLogsArgs(endRestoreTime, startRestoreTime);
        }
    }
}