// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import io.pulumi.azurenative.logic.enums.X12CharacterSet;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 agreement framing settings.
 * 
 */
public final class X12FramingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12FramingSettingsArgs Empty = new X12FramingSettingsArgs();

    /**
     * The X12 character set.
     * 
     */
    @InputImport(name="characterSet", required=true)
      private final Input<Either<String,X12CharacterSet>> characterSet;

    public Input<Either<String,X12CharacterSet>> getCharacterSet() {
        return this.characterSet;
    }

    /**
     * The component separator.
     * 
     */
    @InputImport(name="componentSeparator", required=true)
      private final Input<Integer> componentSeparator;

    public Input<Integer> getComponentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @InputImport(name="dataElementSeparator", required=true)
      private final Input<Integer> dataElementSeparator;

    public Input<Integer> getDataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The replacement character.
     * 
     */
    @InputImport(name="replaceCharacter", required=true)
      private final Input<Integer> replaceCharacter;

    public Input<Integer> getReplaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * The value indicating whether to replace separators in payload.
     * 
     */
    @InputImport(name="replaceSeparatorsInPayload", required=true)
      private final Input<Boolean> replaceSeparatorsInPayload;

    public Input<Boolean> getReplaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * The segment terminator.
     * 
     */
    @InputImport(name="segmentTerminator", required=true)
      private final Input<Integer> segmentTerminator;

    public Input<Integer> getSegmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @InputImport(name="segmentTerminatorSuffix", required=true)
      private final Input<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Input<SegmentTerminatorSuffix> getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    public X12FramingSettingsArgs(
        Input<Either<String,X12CharacterSet>> characterSet,
        Input<Integer> componentSeparator,
        Input<Integer> dataElementSeparator,
        Input<Integer> replaceCharacter,
        Input<Boolean> replaceSeparatorsInPayload,
        Input<Integer> segmentTerminator,
        Input<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
        this.characterSet = Objects.requireNonNull(characterSet, "expected parameter 'characterSet' to be non-null");
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.replaceCharacter = Objects.requireNonNull(replaceCharacter, "expected parameter 'replaceCharacter' to be non-null");
        this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload, "expected parameter 'replaceSeparatorsInPayload' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
    }

    private X12FramingSettingsArgs() {
        this.characterSet = Input.empty();
        this.componentSeparator = Input.empty();
        this.dataElementSeparator = Input.empty();
        this.replaceCharacter = Input.empty();
        this.replaceSeparatorsInPayload = Input.empty();
        this.segmentTerminator = Input.empty();
        this.segmentTerminatorSuffix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12FramingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,X12CharacterSet>> characterSet;
        private Input<Integer> componentSeparator;
        private Input<Integer> dataElementSeparator;
        private Input<Integer> replaceCharacter;
        private Input<Boolean> replaceSeparatorsInPayload;
        private Input<Integer> segmentTerminator;
        private Input<SegmentTerminatorSuffix> segmentTerminatorSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(X12FramingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterSet = defaults.characterSet;
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.replaceCharacter = defaults.replaceCharacter;
    	      this.replaceSeparatorsInPayload = defaults.replaceSeparatorsInPayload;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
        }

        public Builder setCharacterSet(Input<Either<String,X12CharacterSet>> characterSet) {
            this.characterSet = Objects.requireNonNull(characterSet);
            return this;
        }

        public Builder setCharacterSet(Either<String,X12CharacterSet> characterSet) {
            this.characterSet = Input.of(Objects.requireNonNull(characterSet));
            return this;
        }

        public Builder setComponentSeparator(Input<Integer> componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }

        public Builder setComponentSeparator(Integer componentSeparator) {
            this.componentSeparator = Input.of(Objects.requireNonNull(componentSeparator));
            return this;
        }

        public Builder setDataElementSeparator(Input<Integer> dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }

        public Builder setDataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Input.of(Objects.requireNonNull(dataElementSeparator));
            return this;
        }

        public Builder setReplaceCharacter(Input<Integer> replaceCharacter) {
            this.replaceCharacter = Objects.requireNonNull(replaceCharacter);
            return this;
        }

        public Builder setReplaceCharacter(Integer replaceCharacter) {
            this.replaceCharacter = Input.of(Objects.requireNonNull(replaceCharacter));
            return this;
        }

        public Builder setReplaceSeparatorsInPayload(Input<Boolean> replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload);
            return this;
        }

        public Builder setReplaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Input.of(Objects.requireNonNull(replaceSeparatorsInPayload));
            return this;
        }

        public Builder setSegmentTerminator(Input<Integer> segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setSegmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Input.of(Objects.requireNonNull(segmentTerminator));
            return this;
        }

        public Builder setSegmentTerminatorSuffix(Input<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }

        public Builder setSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Input.of(Objects.requireNonNull(segmentTerminatorSuffix));
            return this;
        }
        public X12FramingSettingsArgs build() {
            return new X12FramingSettingsArgs(characterSet, componentSeparator, dataElementSeparator, replaceCharacter, replaceSeparatorsInPayload, segmentTerminator, segmentTerminatorSuffix);
        }
    }
}