// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveredAnalysisStatus;
import com.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveredContinuousAnalysis;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.StatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides information about the scan status of a discovered resource.
 * 
 */
public final class DiscoveredArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiscoveredArgs Empty = new DiscoveredArgs();

    /**
     * The status of discovery for the resource.
     * 
     */
    @Import(name="analysisStatus")
    private @Nullable Output<DiscoveredAnalysisStatus> analysisStatus;

    /**
     * @return The status of discovery for the resource.
     * 
     */
    public Optional<Output<DiscoveredAnalysisStatus>> analysisStatus() {
        return Optional.ofNullable(this.analysisStatus);
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    @Import(name="analysisStatusError")
    private @Nullable Output<StatusArgs> analysisStatusError;

    /**
     * @return When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    public Optional<Output<StatusArgs>> analysisStatusError() {
        return Optional.ofNullable(this.analysisStatusError);
    }

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @Import(name="continuousAnalysis")
    private @Nullable Output<DiscoveredContinuousAnalysis> continuousAnalysis;

    /**
     * @return Whether the resource is continuously analyzed.
     * 
     */
    public Optional<Output<DiscoveredContinuousAnalysis>> continuousAnalysis() {
        return Optional.ofNullable(this.continuousAnalysis);
    }

    /**
     * The CPE of the resource being scanned.
     * 
     */
    @Import(name="cpe")
    private @Nullable Output<String> cpe;

    /**
     * @return The CPE of the resource being scanned.
     * 
     */
    public Optional<Output<String>> cpe() {
        return Optional.ofNullable(this.cpe);
    }

    private DiscoveredArgs() {}

    private DiscoveredArgs(DiscoveredArgs $) {
        this.analysisStatus = $.analysisStatus;
        this.analysisStatusError = $.analysisStatusError;
        this.continuousAnalysis = $.continuousAnalysis;
        this.cpe = $.cpe;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiscoveredArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveredArgs $;

        public Builder() {
            $ = new DiscoveredArgs();
        }

        public Builder(DiscoveredArgs defaults) {
            $ = new DiscoveredArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analysisStatus The status of discovery for the resource.
         * 
         * @return builder
         * 
         */
        public Builder analysisStatus(@Nullable Output<DiscoveredAnalysisStatus> analysisStatus) {
            $.analysisStatus = analysisStatus;
            return this;
        }

        /**
         * @param analysisStatus The status of discovery for the resource.
         * 
         * @return builder
         * 
         */
        public Builder analysisStatus(DiscoveredAnalysisStatus analysisStatus) {
            return analysisStatus(Output.of(analysisStatus));
        }

        /**
         * @param analysisStatusError When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
         * 
         * @return builder
         * 
         */
        public Builder analysisStatusError(@Nullable Output<StatusArgs> analysisStatusError) {
            $.analysisStatusError = analysisStatusError;
            return this;
        }

        /**
         * @param analysisStatusError When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
         * 
         * @return builder
         * 
         */
        public Builder analysisStatusError(StatusArgs analysisStatusError) {
            return analysisStatusError(Output.of(analysisStatusError));
        }

        /**
         * @param continuousAnalysis Whether the resource is continuously analyzed.
         * 
         * @return builder
         * 
         */
        public Builder continuousAnalysis(@Nullable Output<DiscoveredContinuousAnalysis> continuousAnalysis) {
            $.continuousAnalysis = continuousAnalysis;
            return this;
        }

        /**
         * @param continuousAnalysis Whether the resource is continuously analyzed.
         * 
         * @return builder
         * 
         */
        public Builder continuousAnalysis(DiscoveredContinuousAnalysis continuousAnalysis) {
            return continuousAnalysis(Output.of(continuousAnalysis));
        }

        /**
         * @param cpe The CPE of the resource being scanned.
         * 
         * @return builder
         * 
         */
        public Builder cpe(@Nullable Output<String> cpe) {
            $.cpe = cpe;
            return this;
        }

        /**
         * @param cpe The CPE of the resource being scanned.
         * 
         * @return builder
         * 
         */
        public Builder cpe(String cpe) {
            return cpe(Output.of(cpe));
        }

        public DiscoveredArgs build() {
            return $;
        }
    }

}
