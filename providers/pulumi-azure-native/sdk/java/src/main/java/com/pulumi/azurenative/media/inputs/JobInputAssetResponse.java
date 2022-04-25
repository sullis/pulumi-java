// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AbsoluteClipTimeResponse;
import com.pulumi.azurenative.media.inputs.FromAllInputFileResponse;
import com.pulumi.azurenative.media.inputs.FromEachInputFileResponse;
import com.pulumi.azurenative.media.inputs.InputFileResponse;
import com.pulumi.azurenative.media.inputs.UtcClipTimeResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an Asset for input into a Job.
 * 
 */
public final class JobInputAssetResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobInputAssetResponse Empty = new JobInputAssetResponse();

    /**
     * The name of the input Asset.
     * 
     */
    @Import(name="assetName", required=true)
    private String assetName;

    /**
     * @return The name of the input Asset.
     * 
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    @Import(name="end")
    private @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end;

    /**
     * @return Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    public Optional<Either<AbsoluteClipTimeResponse,UtcClipTimeResponse>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    @Import(name="files")
    private @Nullable List<String> files;

    /**
     * @return List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    public Optional<List<String>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    @Import(name="inputDefinitions")
    private @Nullable List<Object> inputDefinitions;

    /**
     * @return Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    public Optional<List<Object>> inputDefinitions() {
        return Optional.ofNullable(this.inputDefinitions);
    }

    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputAsset&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputAsset&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    @Import(name="start")
    private @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start;

    /**
     * @return Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    public Optional<Either<AbsoluteClipTimeResponse,UtcClipTimeResponse>> start() {
        return Optional.ofNullable(this.start);
    }

    private JobInputAssetResponse() {}

    private JobInputAssetResponse(JobInputAssetResponse $) {
        this.assetName = $.assetName;
        this.end = $.end;
        this.files = $.files;
        this.inputDefinitions = $.inputDefinitions;
        this.label = $.label;
        this.odataType = $.odataType;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobInputAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobInputAssetResponse $;

        public Builder() {
            $ = new JobInputAssetResponse();
        }

        public Builder(JobInputAssetResponse defaults) {
            $ = new JobInputAssetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetName The name of the input Asset.
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(AbsoluteClipTimeResponse end) {
            return end(Either.ofLeft(end));
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(UtcClipTimeResponse end) {
            return end(Either.ofRight(end));
        }

        /**
         * @param files List of files. Required for JobInputHttp. Maximum of 4000 characters each.
         * 
         * @return builder
         * 
         */
        public Builder files(@Nullable List<String> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files List of files. Required for JobInputHttp. Maximum of 4000 characters each.
         * 
         * @return builder
         * 
         */
        public Builder files(String... files) {
            return files(List.of(files));
        }

        /**
         * @param inputDefinitions Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder inputDefinitions(@Nullable List<Object> inputDefinitions) {
            $.inputDefinitions = inputDefinitions;
            return this;
        }

        /**
         * @param inputDefinitions Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder inputDefinitions(Object... inputDefinitions) {
            return inputDefinitions(List.of(inputDefinitions));
        }

        /**
         * @param label A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.JobInputAsset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(AbsoluteClipTimeResponse start) {
            return start(Either.ofLeft(start));
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(UtcClipTimeResponse start) {
            return start(Either.ofRight(start));
        }

        public JobInputAssetResponse build() {
            $.assetName = Objects.requireNonNull($.assetName, "expected parameter 'assetName' to be non-null");
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
