package com.stuyfission.fissionlib.input;

import com.qualcomm.robotcore.hardware.Gamepad;

public class GamepadStatic {

//    private Gamepad gamepad;

    public enum Input {
        NONE,
        DPAD_UP,
        DPAD_DOWN,
        DPAD_LEFT,
        DPAD_RIGHT,
        A,
        B,
        X,
        Y,
        START,
        BACK,
        LEFT_BUMPER,
        RIGHT_BUMPER,
        LEFT_STICK_BUTTON,
        RIGHT_STICK_BUTTON
    }

    public GamepadStatic() {}

    public static Input gamepadToEnum(Gamepad gamepad) {
        if (gamepad.dpad_up) return setDPadUp();
        if (gamepad.dpad_down) return setDPadDown();
        if (gamepad.dpad_left) return setDpadLeft();
        if (gamepad.dpad_right) return setDpadRight();
        if (gamepad.a) return setA();
        if (gamepad.b) return setB();
        if (gamepad.x) return setX();
        if (gamepad.y) return setY();
        if (gamepad.start) return setStart();
        if (gamepad.back) return setBack();
        if (gamepad.left_bumper) return setLeftBumper();
        if (gamepad.right_bumper) return setRightBumper();
        if (gamepad.left_stick_button) return setLeftStickButton();
        if (gamepad.right_stick_button) return setRightStickButton();

        return Input.NONE;
    }

    public static Input setDPadUp() {
        return Input.DPAD_UP;
    }

    public static Input setDPadDown() {
        return Input.DPAD_DOWN;
    }

    public static Input setDpadLeft() {
        return Input.DPAD_LEFT;
    }

    public static Input setDpadRight() {
        return Input.DPAD_RIGHT;
    }

    public static Input setA() {
        return Input.A;
    }

    public static Input setB() {
        return Input.B;
    }

    public static Input setX() {
        return Input.X;
    }

    public static Input setY() {
        return Input.Y;
    }

    public static Input setStart() {
        return Input.START;
    }

    public static Input setBack() {
        return Input.BACK;
    }

    public static Input setLeftBumper() {
        return Input.LEFT_BUMPER;
    }

    public static Input setRightBumper() {
        return Input.RIGHT_BUMPER;
    }

    public static Input setLeftStickButton() {
        return Input.LEFT_STICK_BUTTON;
    }

    public static Input setRightStickButton() {
        return Input.RIGHT_STICK_BUTTON;
    }

}
