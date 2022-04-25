// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1beta.outputs.AptSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.outputs.ExecStepResponse;
import com.pulumi.googlenative.osconfig_v1beta.outputs.GooSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.outputs.WindowsUpdateSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.outputs.YumSettingsResponse;
import com.pulumi.googlenative.osconfig_v1beta.outputs.ZypperSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PatchConfigResponse {
    /**
     * @return Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    private final AptSettingsResponse apt;
    /**
     * @return Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    private final GooSettingsResponse goo;
    /**
     * @return Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    private final Boolean migInstancesAllowed;
    /**
     * @return The `ExecStep` to run after the patch update.
     * 
     */
    private final ExecStepResponse postStep;
    /**
     * @return The `ExecStep` to run before the patch update.
     * 
     */
    private final ExecStepResponse preStep;
    /**
     * @return Post-patch reboot settings.
     * 
     */
    private final String rebootConfig;
    /**
     * @return Windows update settings. Use this override the default windows patch rules.
     * 
     */
    private final WindowsUpdateSettingsResponse windowsUpdate;
    /**
     * @return Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    private final YumSettingsResponse yum;
    /**
     * @return Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    private final ZypperSettingsResponse zypper;

    @CustomType.Constructor
    private PatchConfigResponse(
        @CustomType.Parameter("apt") AptSettingsResponse apt,
        @CustomType.Parameter("goo") GooSettingsResponse goo,
        @CustomType.Parameter("migInstancesAllowed") Boolean migInstancesAllowed,
        @CustomType.Parameter("postStep") ExecStepResponse postStep,
        @CustomType.Parameter("preStep") ExecStepResponse preStep,
        @CustomType.Parameter("rebootConfig") String rebootConfig,
        @CustomType.Parameter("windowsUpdate") WindowsUpdateSettingsResponse windowsUpdate,
        @CustomType.Parameter("yum") YumSettingsResponse yum,
        @CustomType.Parameter("zypper") ZypperSettingsResponse zypper) {
        this.apt = apt;
        this.goo = goo;
        this.migInstancesAllowed = migInstancesAllowed;
        this.postStep = postStep;
        this.preStep = preStep;
        this.rebootConfig = rebootConfig;
        this.windowsUpdate = windowsUpdate;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * @return Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    public AptSettingsResponse apt() {
        return this.apt;
    }
    /**
     * @return Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    public GooSettingsResponse goo() {
        return this.goo;
    }
    /**
     * @return Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    public Boolean migInstancesAllowed() {
        return this.migInstancesAllowed;
    }
    /**
     * @return The `ExecStep` to run after the patch update.
     * 
     */
    public ExecStepResponse postStep() {
        return this.postStep;
    }
    /**
     * @return The `ExecStep` to run before the patch update.
     * 
     */
    public ExecStepResponse preStep() {
        return this.preStep;
    }
    /**
     * @return Post-patch reboot settings.
     * 
     */
    public String rebootConfig() {
        return this.rebootConfig;
    }
    /**
     * @return Windows update settings. Use this override the default windows patch rules.
     * 
     */
    public WindowsUpdateSettingsResponse windowsUpdate() {
        return this.windowsUpdate;
    }
    /**
     * @return Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    public YumSettingsResponse yum() {
        return this.yum;
    }
    /**
     * @return Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    public ZypperSettingsResponse zypper() {
        return this.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AptSettingsResponse apt;
        private GooSettingsResponse goo;
        private Boolean migInstancesAllowed;
        private ExecStepResponse postStep;
        private ExecStepResponse preStep;
        private String rebootConfig;
        private WindowsUpdateSettingsResponse windowsUpdate;
        private YumSettingsResponse yum;
        private ZypperSettingsResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.migInstancesAllowed = defaults.migInstancesAllowed;
    	      this.postStep = defaults.postStep;
    	      this.preStep = defaults.preStep;
    	      this.rebootConfig = defaults.rebootConfig;
    	      this.windowsUpdate = defaults.windowsUpdate;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(AptSettingsResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }
        public Builder goo(GooSettingsResponse goo) {
            this.goo = Objects.requireNonNull(goo);
            return this;
        }
        public Builder migInstancesAllowed(Boolean migInstancesAllowed) {
            this.migInstancesAllowed = Objects.requireNonNull(migInstancesAllowed);
            return this;
        }
        public Builder postStep(ExecStepResponse postStep) {
            this.postStep = Objects.requireNonNull(postStep);
            return this;
        }
        public Builder preStep(ExecStepResponse preStep) {
            this.preStep = Objects.requireNonNull(preStep);
            return this;
        }
        public Builder rebootConfig(String rebootConfig) {
            this.rebootConfig = Objects.requireNonNull(rebootConfig);
            return this;
        }
        public Builder windowsUpdate(WindowsUpdateSettingsResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }
        public Builder yum(YumSettingsResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }
        public Builder zypper(ZypperSettingsResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }        public PatchConfigResponse build() {
            return new PatchConfigResponse(apt, goo, migInstancesAllowed, postStep, preStep, rebootConfig, windowsUpdate, yum, zypper);
        }
    }
}
