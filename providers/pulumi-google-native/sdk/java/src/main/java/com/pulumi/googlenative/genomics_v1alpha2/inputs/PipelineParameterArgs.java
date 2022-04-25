// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.genomics_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.genomics_v1alpha2.inputs.LocalCopyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters facilitate setting and delivering data into the pipeline&#39;s execution environment. They are defined at create time, with optional defaults, and can be overridden at run time. If `localCopy` is unset, then the parameter specifies a string that is passed as-is into the pipeline, as the value of the environment variable with the given name. A default value can be optionally specified at create time. The default can be overridden at run time using the inputs map. If no default is given, a value must be supplied at runtime. If `localCopy` is defined, then the parameter specifies a data source or sink, both in Google Cloud Storage and on the Docker container where the pipeline computation is run. The service account associated with the Pipeline (by default the project&#39;s Compute Engine service account) must have access to the Google Cloud Storage paths. At run time, the Google Cloud Storage paths can be overridden if a default was provided at create time, or must be set otherwise. The pipeline runner should add a key/value pair to either the inputs or outputs map. The indicated data copies will be carried out before/after pipeline execution, just as if the corresponding arguments were provided to `gsutil cp`. For example: Given the following `PipelineParameter`, specified in the `inputParameters` list: ```{name: &#34;input_file&#34;, localCopy: {path: &#34;file.txt&#34;, disk: &#34;pd1&#34;}}``` where `disk` is defined in the `PipelineResources` object as: ```{name: &#34;pd1&#34;, mountPoint: &#34;/mnt/disk/&#34;}``` We create a disk named `pd1`, mount it on the host VM, and map `/mnt/pd1` to `/mnt/disk` in the docker container. At runtime, an entry for `input_file` would be required in the inputs map, such as: ```inputs[&#34;input_file&#34;] = &#34;gs://my-bucket/bar.txt&#34;``` This would generate the following gsutil call: ```gsutil cp gs://my-bucket/bar.txt /mnt/pd1/file.txt``` The file `/mnt/pd1/file.txt` maps to `/mnt/disk/file.txt` in the Docker container. Acceptable paths are: Google Cloud storage pathLocal path file file glob directory For outputs, the direction of the copy is reversed: ```gsutil cp /mnt/disk/file.txt gs://my-bucket/bar.txt``` Acceptable paths are: Local pathGoogle Cloud Storage path file file file directory - directory must already exist glob directory - directory will be created if it doesn&#39;t exist One restriction due to docker limitations, is that for outputs that are found on the boot disk, the local path cannot be a glob and must be a file.
 * 
 */
public final class PipelineParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineParameterArgs Empty = new PipelineParameterArgs();

    /**
     * The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Human-readable description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human-readable description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
     * 
     */
    @Import(name="localCopy")
    private @Nullable Output<LocalCopyArgs> localCopy;

    /**
     * @return If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
     * 
     */
    public Optional<Output<LocalCopyArgs>> localCopy() {
        return Optional.ofNullable(this.localCopy);
    }

    /**
     * Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private PipelineParameterArgs() {}

    private PipelineParameterArgs(PipelineParameterArgs $) {
        this.defaultValue = $.defaultValue;
        this.description = $.description;
        this.localCopy = $.localCopy;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineParameterArgs $;

        public Builder() {
            $ = new PipelineParameterArgs();
        }

        public Builder(PipelineParameterArgs defaults) {
            $ = new PipelineParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param description Human-readable description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human-readable description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param localCopy If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
         * 
         * @return builder
         * 
         */
        public Builder localCopy(@Nullable Output<LocalCopyArgs> localCopy) {
            $.localCopy = localCopy;
            return this;
        }

        /**
         * @param localCopy If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
         * 
         * @return builder
         * 
         */
        public Builder localCopy(LocalCopyArgs localCopy) {
            return localCopy(Output.of(localCopy));
        }

        /**
         * @param name Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PipelineParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
