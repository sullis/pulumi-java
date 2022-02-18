// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Asset sink.
 * 
 */
public final class MediaGraphAssetSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaGraphAssetSinkArgs Empty = new MediaGraphAssetSinkArgs();

    /**
     * Asset name.
     * 
     */
    @InputImport(name="assetName", required=true)
    private final Input<String> assetName;

    public Input<String> getAssetName() {
        return this.assetName;
    }

    /**
     * Sink inputs.
     * 
     */
    @InputImport(name="inputs", required=true)
    private final Input<List<String>> inputs;

    public Input<List<String>> getInputs() {
        return this.inputs;
    }

    /**
     * Sink name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphAssetSink'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public MediaGraphAssetSinkArgs(
        Input<String> assetName,
        Input<List<String>> inputs,
        Input<String> name,
        Input<String> odataType) {
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.inputs = Objects.requireNonNull(inputs, "expected parameter 'inputs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private MediaGraphAssetSinkArgs() {
        this.assetName = Input.empty();
        this.inputs = Input.empty();
        this.name = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphAssetSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> assetName;
        private Input<List<String>> inputs;
        private Input<String> name;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphAssetSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAssetName(Input<String> assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Input.of(Objects.requireNonNull(assetName));
            return this;
        }

        public Builder setInputs(Input<List<String>> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder setInputs(List<String> inputs) {
            this.inputs = Input.of(Objects.requireNonNull(inputs));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public MediaGraphAssetSinkArgs build() {
            return new MediaGraphAssetSinkArgs(assetName, inputs, name, odataType);
        }
    }
}
