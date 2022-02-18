// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous time interval. This window is used in metric and aggregation computations.
 * 
 */
public final class AssetModelTumblingWindow extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelTumblingWindow Empty = new AssetModelTumblingWindow();

    @InputImport(name="interval", required=true)
    private final String interval;

    public String getInterval() {
        return this.interval;
    }

    @InputImport(name="offset")
    private final @Nullable String offset;

    public Optional<String> getOffset() {
        return this.offset == null ? Optional.empty() : Optional.ofNullable(this.offset);
    }

    public AssetModelTumblingWindow(
        String interval,
        @Nullable String offset) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.offset = offset;
    }

    private AssetModelTumblingWindow() {
        this.interval = null;
        this.offset = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelTumblingWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interval;
        private @Nullable String offset;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelTumblingWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.offset = defaults.offset;
        }

        public Builder setInterval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setOffset(@Nullable String offset) {
            this.offset = offset;
            return this;
        }

        public AssetModelTumblingWindow build() {
            return new AssetModelTumblingWindow(interval, offset);
        }
    }
}
