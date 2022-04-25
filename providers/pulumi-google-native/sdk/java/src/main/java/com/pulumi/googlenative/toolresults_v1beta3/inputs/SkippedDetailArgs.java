// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details for an outcome with a SKIPPED outcome summary.
 * 
 */
public final class SkippedDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkippedDetailArgs Empty = new SkippedDetailArgs();

    /**
     * If the App doesn&#39;t support the specific API level.
     * 
     */
    @Import(name="incompatibleAppVersion")
    private @Nullable Output<Boolean> incompatibleAppVersion;

    /**
     * @return If the App doesn&#39;t support the specific API level.
     * 
     */
    public Optional<Output<Boolean>> incompatibleAppVersion() {
        return Optional.ofNullable(this.incompatibleAppVersion);
    }

    /**
     * If the App doesn&#39;t run on the specific architecture, for example, x86.
     * 
     */
    @Import(name="incompatibleArchitecture")
    private @Nullable Output<Boolean> incompatibleArchitecture;

    /**
     * @return If the App doesn&#39;t run on the specific architecture, for example, x86.
     * 
     */
    public Optional<Output<Boolean>> incompatibleArchitecture() {
        return Optional.ofNullable(this.incompatibleArchitecture);
    }

    /**
     * If the requested OS version doesn&#39;t run on the specific device model.
     * 
     */
    @Import(name="incompatibleDevice")
    private @Nullable Output<Boolean> incompatibleDevice;

    /**
     * @return If the requested OS version doesn&#39;t run on the specific device model.
     * 
     */
    public Optional<Output<Boolean>> incompatibleDevice() {
        return Optional.ofNullable(this.incompatibleDevice);
    }

    private SkippedDetailArgs() {}

    private SkippedDetailArgs(SkippedDetailArgs $) {
        this.incompatibleAppVersion = $.incompatibleAppVersion;
        this.incompatibleArchitecture = $.incompatibleArchitecture;
        this.incompatibleDevice = $.incompatibleDevice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkippedDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkippedDetailArgs $;

        public Builder() {
            $ = new SkippedDetailArgs();
        }

        public Builder(SkippedDetailArgs defaults) {
            $ = new SkippedDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param incompatibleAppVersion If the App doesn&#39;t support the specific API level.
         * 
         * @return builder
         * 
         */
        public Builder incompatibleAppVersion(@Nullable Output<Boolean> incompatibleAppVersion) {
            $.incompatibleAppVersion = incompatibleAppVersion;
            return this;
        }

        /**
         * @param incompatibleAppVersion If the App doesn&#39;t support the specific API level.
         * 
         * @return builder
         * 
         */
        public Builder incompatibleAppVersion(Boolean incompatibleAppVersion) {
            return incompatibleAppVersion(Output.of(incompatibleAppVersion));
        }

        /**
         * @param incompatibleArchitecture If the App doesn&#39;t run on the specific architecture, for example, x86.
         * 
         * @return builder
         * 
         */
        public Builder incompatibleArchitecture(@Nullable Output<Boolean> incompatibleArchitecture) {
            $.incompatibleArchitecture = incompatibleArchitecture;
            return this;
        }

        /**
         * @param incompatibleArchitecture If the App doesn&#39;t run on the specific architecture, for example, x86.
         * 
         * @return builder
         * 
         */
        public Builder incompatibleArchitecture(Boolean incompatibleArchitecture) {
            return incompatibleArchitecture(Output.of(incompatibleArchitecture));
        }

        /**
         * @param incompatibleDevice If the requested OS version doesn&#39;t run on the specific device model.
         * 
         * @return builder
         * 
         */
        public Builder incompatibleDevice(@Nullable Output<Boolean> incompatibleDevice) {
            $.incompatibleDevice = incompatibleDevice;
            return this;
        }

        /**
         * @param incompatibleDevice If the requested OS version doesn&#39;t run on the specific device model.
         * 
         * @return builder
         * 
         */
        public Builder incompatibleDevice(Boolean incompatibleDevice) {
            return incompatibleDevice(Output.of(incompatibleDevice));
        }

        public SkippedDetailArgs build() {
            return $;
        }
    }

}
