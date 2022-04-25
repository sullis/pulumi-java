// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatadogInstallMethodResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatadogInstallMethodResponse Empty = new DatadogInstallMethodResponse();

    /**
     * The installer version.
     * 
     */
    @Import(name="installerVersion")
    private @Nullable String installerVersion;

    /**
     * @return The installer version.
     * 
     */
    public Optional<String> installerVersion() {
        return Optional.ofNullable(this.installerVersion);
    }

    /**
     * The tool.
     * 
     */
    @Import(name="tool")
    private @Nullable String tool;

    /**
     * @return The tool.
     * 
     */
    public Optional<String> tool() {
        return Optional.ofNullable(this.tool);
    }

    /**
     * The tool version.
     * 
     */
    @Import(name="toolVersion")
    private @Nullable String toolVersion;

    /**
     * @return The tool version.
     * 
     */
    public Optional<String> toolVersion() {
        return Optional.ofNullable(this.toolVersion);
    }

    private DatadogInstallMethodResponse() {}

    private DatadogInstallMethodResponse(DatadogInstallMethodResponse $) {
        this.installerVersion = $.installerVersion;
        this.tool = $.tool;
        this.toolVersion = $.toolVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatadogInstallMethodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatadogInstallMethodResponse $;

        public Builder() {
            $ = new DatadogInstallMethodResponse();
        }

        public Builder(DatadogInstallMethodResponse defaults) {
            $ = new DatadogInstallMethodResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param installerVersion The installer version.
         * 
         * @return builder
         * 
         */
        public Builder installerVersion(@Nullable String installerVersion) {
            $.installerVersion = installerVersion;
            return this;
        }

        /**
         * @param tool The tool.
         * 
         * @return builder
         * 
         */
        public Builder tool(@Nullable String tool) {
            $.tool = tool;
            return this;
        }

        /**
         * @param toolVersion The tool version.
         * 
         * @return builder
         * 
         */
        public Builder toolVersion(@Nullable String toolVersion) {
            $.toolVersion = toolVersion;
            return this;
        }

        public DatadogInstallMethodResponse build() {
            return $;
        }
    }

}
