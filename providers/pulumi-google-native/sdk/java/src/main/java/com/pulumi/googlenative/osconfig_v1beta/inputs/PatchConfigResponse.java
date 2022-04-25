// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.AptSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.ExecStepResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.GooSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.WindowsUpdateSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.YumSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.ZypperSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Patch configuration specifications. Contains details on how to apply the patch(es) to a VM instance.
 * 
 */
public final class PatchConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final PatchConfigResponse Empty = new PatchConfigResponse();

    /**
     * Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    @Import(name="apt", required=true)
    private AptSettingsResponse apt;

    /**
     * @return Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    public AptSettingsResponse apt() {
        return this.apt;
    }

    /**
     * Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    @Import(name="goo", required=true)
    private GooSettingsResponse goo;

    /**
     * @return Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    public GooSettingsResponse goo() {
        return this.goo;
    }

    /**
     * Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    @Import(name="migInstancesAllowed", required=true)
    private Boolean migInstancesAllowed;

    /**
     * @return Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    public Boolean migInstancesAllowed() {
        return this.migInstancesAllowed;
    }

    /**
     * The `ExecStep` to run after the patch update.
     * 
     */
    @Import(name="postStep", required=true)
    private ExecStepResponse postStep;

    /**
     * @return The `ExecStep` to run after the patch update.
     * 
     */
    public ExecStepResponse postStep() {
        return this.postStep;
    }

    /**
     * The `ExecStep` to run before the patch update.
     * 
     */
    @Import(name="preStep", required=true)
    private ExecStepResponse preStep;

    /**
     * @return The `ExecStep` to run before the patch update.
     * 
     */
    public ExecStepResponse preStep() {
        return this.preStep;
    }

    /**
     * Post-patch reboot settings.
     * 
     */
    @Import(name="rebootConfig", required=true)
    private String rebootConfig;

    /**
     * @return Post-patch reboot settings.
     * 
     */
    public String rebootConfig() {
        return this.rebootConfig;
    }

    /**
     * Windows update settings. Use this override the default windows patch rules.
     * 
     */
    @Import(name="windowsUpdate", required=true)
    private WindowsUpdateSettingsResponse windowsUpdate;

    /**
     * @return Windows update settings. Use this override the default windows patch rules.
     * 
     */
    public WindowsUpdateSettingsResponse windowsUpdate() {
        return this.windowsUpdate;
    }

    /**
     * Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    @Import(name="yum", required=true)
    private YumSettingsResponse yum;

    /**
     * @return Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    public YumSettingsResponse yum() {
        return this.yum;
    }

    /**
     * Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    @Import(name="zypper", required=true)
    private ZypperSettingsResponse zypper;

    /**
     * @return Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    public ZypperSettingsResponse zypper() {
        return this.zypper;
    }

    private PatchConfigResponse() {}

    private PatchConfigResponse(PatchConfigResponse $) {
        this.apt = $.apt;
        this.goo = $.goo;
        this.migInstancesAllowed = $.migInstancesAllowed;
        this.postStep = $.postStep;
        this.preStep = $.preStep;
        this.rebootConfig = $.rebootConfig;
        this.windowsUpdate = $.windowsUpdate;
        this.yum = $.yum;
        this.zypper = $.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchConfigResponse $;

        public Builder() {
            $ = new PatchConfigResponse();
        }

        public Builder(PatchConfigResponse defaults) {
            $ = new PatchConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param apt Apt update settings. Use this setting to override the default `apt` patch rules.
         * 
         * @return builder
         * 
         */
        public Builder apt(AptSettingsResponse apt) {
            $.apt = apt;
            return this;
        }

        /**
         * @param goo Goo update settings. Use this setting to override the default `goo` patch rules.
         * 
         * @return builder
         * 
         */
        public Builder goo(GooSettingsResponse goo) {
            $.goo = goo;
            return this;
        }

        /**
         * @param migInstancesAllowed Allows the patch job to run on Managed instance groups (MIGs).
         * 
         * @return builder
         * 
         */
        public Builder migInstancesAllowed(Boolean migInstancesAllowed) {
            $.migInstancesAllowed = migInstancesAllowed;
            return this;
        }

        /**
         * @param postStep The `ExecStep` to run after the patch update.
         * 
         * @return builder
         * 
         */
        public Builder postStep(ExecStepResponse postStep) {
            $.postStep = postStep;
            return this;
        }

        /**
         * @param preStep The `ExecStep` to run before the patch update.
         * 
         * @return builder
         * 
         */
        public Builder preStep(ExecStepResponse preStep) {
            $.preStep = preStep;
            return this;
        }

        /**
         * @param rebootConfig Post-patch reboot settings.
         * 
         * @return builder
         * 
         */
        public Builder rebootConfig(String rebootConfig) {
            $.rebootConfig = rebootConfig;
            return this;
        }

        /**
         * @param windowsUpdate Windows update settings. Use this override the default windows patch rules.
         * 
         * @return builder
         * 
         */
        public Builder windowsUpdate(WindowsUpdateSettingsResponse windowsUpdate) {
            $.windowsUpdate = windowsUpdate;
            return this;
        }

        /**
         * @param yum Yum update settings. Use this setting to override the default `yum` patch rules.
         * 
         * @return builder
         * 
         */
        public Builder yum(YumSettingsResponse yum) {
            $.yum = yum;
            return this;
        }

        /**
         * @param zypper Zypper update settings. Use this setting to override the default `zypper` patch rules.
         * 
         * @return builder
         * 
         */
        public Builder zypper(ZypperSettingsResponse zypper) {
            $.zypper = zypper;
            return this;
        }

        public PatchConfigResponse build() {
            $.apt = Objects.requireNonNull($.apt, "expected parameter 'apt' to be non-null");
            $.goo = Objects.requireNonNull($.goo, "expected parameter 'goo' to be non-null");
            $.migInstancesAllowed = Objects.requireNonNull($.migInstancesAllowed, "expected parameter 'migInstancesAllowed' to be non-null");
            $.postStep = Objects.requireNonNull($.postStep, "expected parameter 'postStep' to be non-null");
            $.preStep = Objects.requireNonNull($.preStep, "expected parameter 'preStep' to be non-null");
            $.rebootConfig = Objects.requireNonNull($.rebootConfig, "expected parameter 'rebootConfig' to be non-null");
            $.windowsUpdate = Objects.requireNonNull($.windowsUpdate, "expected parameter 'windowsUpdate' to be non-null");
            $.yum = Objects.requireNonNull($.yum, "expected parameter 'yum' to be non-null");
            $.zypper = Objects.requireNonNull($.zypper, "expected parameter 'zypper' to be non-null");
            return $;
        }
    }

}
