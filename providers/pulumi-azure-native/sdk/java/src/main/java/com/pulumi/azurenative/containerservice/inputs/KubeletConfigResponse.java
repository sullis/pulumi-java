// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubelet configurations of agent nodes.
 * 
 */
public final class KubeletConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubeletConfigResponse Empty = new KubeletConfigResponse();

    /**
     * Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     * 
     */
    @Import(name="allowedUnsafeSysctls")
    private @Nullable List<String> allowedUnsafeSysctls;

    /**
     * @return Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     * 
     */
    public Optional<List<String>> allowedUnsafeSysctls() {
        return Optional.ofNullable(this.allowedUnsafeSysctls);
    }

    /**
     * The maximum number of container log files that can be present for a container. The number must be ≥ 2.
     * 
     */
    @Import(name="containerLogMaxFiles")
    private @Nullable Integer containerLogMaxFiles;

    /**
     * @return The maximum number of container log files that can be present for a container. The number must be ≥ 2.
     * 
     */
    public Optional<Integer> containerLogMaxFiles() {
        return Optional.ofNullable(this.containerLogMaxFiles);
    }

    /**
     * The maximum size (e.g. 10Mi) of container log file before it is rotated.
     * 
     */
    @Import(name="containerLogMaxSizeMB")
    private @Nullable Integer containerLogMaxSizeMB;

    /**
     * @return The maximum size (e.g. 10Mi) of container log file before it is rotated.
     * 
     */
    public Optional<Integer> containerLogMaxSizeMB() {
        return Optional.ofNullable(this.containerLogMaxSizeMB);
    }

    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    @Import(name="cpuCfsQuota")
    private @Nullable Boolean cpuCfsQuota;

    /**
     * @return Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    public Optional<Boolean> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }

    /**
     * Sets CPU CFS quota period value.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
    private @Nullable String cpuCfsQuotaPeriod;

    /**
     * @return Sets CPU CFS quota period value.
     * 
     */
    public Optional<String> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }

    /**
     * CPU Manager policy to use.
     * 
     */
    @Import(name="cpuManagerPolicy")
    private @Nullable String cpuManagerPolicy;

    /**
     * @return CPU Manager policy to use.
     * 
     */
    public Optional<String> cpuManagerPolicy() {
        return Optional.ofNullable(this.cpuManagerPolicy);
    }

    /**
     * If set to true it will make the Kubelet fail to start if swap is enabled on the node.
     * 
     */
    @Import(name="failSwapOn")
    private @Nullable Boolean failSwapOn;

    /**
     * @return If set to true it will make the Kubelet fail to start if swap is enabled on the node.
     * 
     */
    public Optional<Boolean> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }

    /**
     * The percent of disk usage after which image garbage collection is always run.
     * 
     */
    @Import(name="imageGcHighThreshold")
    private @Nullable Integer imageGcHighThreshold;

    /**
     * @return The percent of disk usage after which image garbage collection is always run.
     * 
     */
    public Optional<Integer> imageGcHighThreshold() {
        return Optional.ofNullable(this.imageGcHighThreshold);
    }

    /**
     * The percent of disk usage before which image garbage collection is never run.
     * 
     */
    @Import(name="imageGcLowThreshold")
    private @Nullable Integer imageGcLowThreshold;

    /**
     * @return The percent of disk usage before which image garbage collection is never run.
     * 
     */
    public Optional<Integer> imageGcLowThreshold() {
        return Optional.ofNullable(this.imageGcLowThreshold);
    }

    /**
     * The maximum number of processes per pod.
     * 
     */
    @Import(name="podMaxPids")
    private @Nullable Integer podMaxPids;

    /**
     * @return The maximum number of processes per pod.
     * 
     */
    public Optional<Integer> podMaxPids() {
        return Optional.ofNullable(this.podMaxPids);
    }

    /**
     * Topology Manager policy to use.
     * 
     */
    @Import(name="topologyManagerPolicy")
    private @Nullable String topologyManagerPolicy;

    /**
     * @return Topology Manager policy to use.
     * 
     */
    public Optional<String> topologyManagerPolicy() {
        return Optional.ofNullable(this.topologyManagerPolicy);
    }

    private KubeletConfigResponse() {}

    private KubeletConfigResponse(KubeletConfigResponse $) {
        this.allowedUnsafeSysctls = $.allowedUnsafeSysctls;
        this.containerLogMaxFiles = $.containerLogMaxFiles;
        this.containerLogMaxSizeMB = $.containerLogMaxSizeMB;
        this.cpuCfsQuota = $.cpuCfsQuota;
        this.cpuCfsQuotaPeriod = $.cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = $.cpuManagerPolicy;
        this.failSwapOn = $.failSwapOn;
        this.imageGcHighThreshold = $.imageGcHighThreshold;
        this.imageGcLowThreshold = $.imageGcLowThreshold;
        this.podMaxPids = $.podMaxPids;
        this.topologyManagerPolicy = $.topologyManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubeletConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubeletConfigResponse $;

        public Builder() {
            $ = new KubeletConfigResponse();
        }

        public Builder(KubeletConfigResponse defaults) {
            $ = new KubeletConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedUnsafeSysctls Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
         * 
         * @return builder
         * 
         */
        public Builder allowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            $.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        /**
         * @param allowedUnsafeSysctls Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
         * 
         * @return builder
         * 
         */
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }

        /**
         * @param containerLogMaxFiles The maximum number of container log files that can be present for a container. The number must be ≥ 2.
         * 
         * @return builder
         * 
         */
        public Builder containerLogMaxFiles(@Nullable Integer containerLogMaxFiles) {
            $.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }

        /**
         * @param containerLogMaxSizeMB The maximum size (e.g. 10Mi) of container log file before it is rotated.
         * 
         * @return builder
         * 
         */
        public Builder containerLogMaxSizeMB(@Nullable Integer containerLogMaxSizeMB) {
            $.containerLogMaxSizeMB = containerLogMaxSizeMB;
            return this;
        }

        /**
         * @param cpuCfsQuota Enable CPU CFS quota enforcement for containers that specify CPU limits.
         * 
         * @return builder
         * 
         */
        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            $.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        /**
         * @param cpuCfsQuotaPeriod Sets CPU CFS quota period value.
         * 
         * @return builder
         * 
         */
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            $.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        /**
         * @param cpuManagerPolicy CPU Manager policy to use.
         * 
         * @return builder
         * 
         */
        public Builder cpuManagerPolicy(@Nullable String cpuManagerPolicy) {
            $.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }

        /**
         * @param failSwapOn If set to true it will make the Kubelet fail to start if swap is enabled on the node.
         * 
         * @return builder
         * 
         */
        public Builder failSwapOn(@Nullable Boolean failSwapOn) {
            $.failSwapOn = failSwapOn;
            return this;
        }

        /**
         * @param imageGcHighThreshold The percent of disk usage after which image garbage collection is always run.
         * 
         * @return builder
         * 
         */
        public Builder imageGcHighThreshold(@Nullable Integer imageGcHighThreshold) {
            $.imageGcHighThreshold = imageGcHighThreshold;
            return this;
        }

        /**
         * @param imageGcLowThreshold The percent of disk usage before which image garbage collection is never run.
         * 
         * @return builder
         * 
         */
        public Builder imageGcLowThreshold(@Nullable Integer imageGcLowThreshold) {
            $.imageGcLowThreshold = imageGcLowThreshold;
            return this;
        }

        /**
         * @param podMaxPids The maximum number of processes per pod.
         * 
         * @return builder
         * 
         */
        public Builder podMaxPids(@Nullable Integer podMaxPids) {
            $.podMaxPids = podMaxPids;
            return this;
        }

        /**
         * @param topologyManagerPolicy Topology Manager policy to use.
         * 
         * @return builder
         * 
         */
        public Builder topologyManagerPolicy(@Nullable String topologyManagerPolicy) {
            $.topologyManagerPolicy = topologyManagerPolicy;
            return this;
        }

        public KubeletConfigResponse build() {
            return $;
        }
    }

}
