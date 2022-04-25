// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.awsnative.nimblestudio.enums.StudioComponentInitializationScriptRunContext;
import com.pulumi.awsnative.nimblestudio.enums.StudioComponentLaunchProfilePlatform;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Initialization scripts for studio components.&lt;/p&gt;
 * 
 */
public final class StudioComponentInitializationScript extends com.pulumi.resources.InvokeArgs {

    public static final StudioComponentInitializationScript Empty = new StudioComponentInitializationScript();

    /**
     * &lt;p&gt;The version number of the protocol that is used by the launch profile. The only valid version is &#34;2021-03-31&#34;.&lt;/p&gt;
     * 
     */
    @Import(name="launchProfileProtocolVersion")
    private @Nullable String launchProfileProtocolVersion;

    /**
     * @return &lt;p&gt;The version number of the protocol that is used by the launch profile. The only valid version is &#34;2021-03-31&#34;.&lt;/p&gt;
     * 
     */
    public Optional<String> launchProfileProtocolVersion() {
        return Optional.ofNullable(this.launchProfileProtocolVersion);
    }

    @Import(name="platform")
    private @Nullable StudioComponentLaunchProfilePlatform platform;

    public Optional<StudioComponentLaunchProfilePlatform> platform() {
        return Optional.ofNullable(this.platform);
    }

    @Import(name="runContext")
    private @Nullable StudioComponentInitializationScriptRunContext runContext;

    public Optional<StudioComponentInitializationScriptRunContext> runContext() {
        return Optional.ofNullable(this.runContext);
    }

    /**
     * &lt;p&gt;The initialization script.&lt;/p&gt;
     * 
     */
    @Import(name="script")
    private @Nullable String script;

    /**
     * @return &lt;p&gt;The initialization script.&lt;/p&gt;
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }

    private StudioComponentInitializationScript() {}

    private StudioComponentInitializationScript(StudioComponentInitializationScript $) {
        this.launchProfileProtocolVersion = $.launchProfileProtocolVersion;
        this.platform = $.platform;
        this.runContext = $.runContext;
        this.script = $.script;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioComponentInitializationScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioComponentInitializationScript $;

        public Builder() {
            $ = new StudioComponentInitializationScript();
        }

        public Builder(StudioComponentInitializationScript defaults) {
            $ = new StudioComponentInitializationScript(Objects.requireNonNull(defaults));
        }

        /**
         * @param launchProfileProtocolVersion &lt;p&gt;The version number of the protocol that is used by the launch profile. The only valid version is &#34;2021-03-31&#34;.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder launchProfileProtocolVersion(@Nullable String launchProfileProtocolVersion) {
            $.launchProfileProtocolVersion = launchProfileProtocolVersion;
            return this;
        }

        public Builder platform(@Nullable StudioComponentLaunchProfilePlatform platform) {
            $.platform = platform;
            return this;
        }

        public Builder runContext(@Nullable StudioComponentInitializationScriptRunContext runContext) {
            $.runContext = runContext;
            return this;
        }

        /**
         * @param script &lt;p&gt;The initialization script.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable String script) {
            $.script = script;
            return this;
        }

        public StudioComponentInitializationScript build() {
            return $;
        }
    }

}
